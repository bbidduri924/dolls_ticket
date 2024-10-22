package com.spring_boot_dolls_ticket.project.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.spring_boot_dolls_ticket.project.dao.IPerformanceDAO;
import com.spring_boot_dolls_ticket.project.model.PerformanceVO;

@Service
public class PerformanceService implements IPerformanceService {

	@Autowired
	@Qualifier("IPerformanceDAO")
	IPerformanceDAO dao;
	

	public PerformanceVO detailViewPerformance(String performanceId) {
		// TODO Auto-generated method stub
		return dao.detailViewPerformance(performanceId);
	}


	@Override
	public PerformanceVO getEventById(String performanceId) {
		// TODO Auto-generated method stub
		return dao.getEventById(performanceId);
	}
	@Override
	public ArrayList<PerformanceVO> listAllPerformance() {
		return dao.listAllPerformance();
	}
	// 공연 정보 수정 및 이미지 업데이트
	@Override
    public void updatePerformance(PerformanceVO performance, MultipartFile performancePoster, MultipartFile performanceInfoImg) throws IOException {
        // 공연 정보 수정
		System.out.println("Performance ID: " + performance.getPerformanceId());
		System.out.println("Performance Name: " + performance.getPerformanceName());
        dao.updatePerformance(performance);

        // 이미지 파일 경로 설정
        String performanceId = performance.getPerformanceId();
        String posterPath = performanceId + ".jpg";
        String infoImgPath = performanceId + "_info.jpg";

        // 이미지 파일 저장
        saveFile(performancePoster, posterPath);
        saveFile(performanceInfoImg, infoImgPath);
        System.out.println(posterPath);
        System.out.println(infoImgPath);

    }
	@Override
	public void deletePerformance(String performanceId) {
		dao.deletePerformance(performanceId);
	}
	// 공연 정보 등록 및 이미지 경로 설정
    public void insertPerformance(PerformanceVO performance, MultipartFile performancePoster, MultipartFile performanceInfoImg) throws IOException {
        // 공연 정보 삽입 -> 삽입 후 performanceId가 자동으로 설정됨
        dao.insertPerformance(performance);
        String generatedId = dao.selectGeneratedId();
        performance.setPerformanceId(generatedId);
        
        // ID가 제대로 생성되었는지 확인하는 디버깅 코드
        System.out.println("Generated PERFORMANCE_ID: " + performance.getPerformanceId());

        // 생성된 performanceId로 이미지 경로 생성
        String performanceId = performance.getPerformanceId();
        String posterPath = performanceId + ".jpg";
        String infoImgPath = performanceId + "_info.jpg";

        // 이미지 경로 VO에 설정
        performance.setPerformanceImagePath(posterPath);
        performance.setPerformanceInformationImagePath(infoImgPath);

        // 이미지 파일 저장
        saveFile(performancePoster, posterPath);
        saveFile(performanceInfoImg, infoImgPath);
        System.out.println(posterPath);
        System.out.println(infoImgPath);

        // 이미지 경로를 DB에 업데이트
        dao.updateImgPath(performance);
    }

    // 파일 저장 메서드
    private void saveFile(MultipartFile file, String filePath) throws IOException {
        if (!file.isEmpty()) {
            Path path = Paths.get("/Users/dlwlgus/springBootWorkspace/ticket_images/" + filePath);
            Files.copy(file.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);
        }
    }

    // 이미지 경로를 DB에 업데이트
    public void updateImgPath(PerformanceVO performance) {
        dao.updateImgPath(performance);
    }
    

}
