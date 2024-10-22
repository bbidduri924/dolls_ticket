package com.spring_boot_dolls_ticket.project.service;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.web.multipart.MultipartFile;

import com.spring_boot_dolls_ticket.project.model.PerformanceVO;

public interface IPerformanceService {

	PerformanceVO detailViewPerformance(String performanceId);
	PerformanceVO getEventById(String performanceId);
	ArrayList<PerformanceVO> listAllPerformance(); // READ - 모든 공연 정보 list
	void updatePerformance(PerformanceVO performance); // UPDATE - 공연 정보 수정
	void deletePerformance(String performanceId); // DELETE - 공연 정보 삭제
	public void insertPerformance(PerformanceVO performance, MultipartFile performancePoster, MultipartFile performanceInfoImg) throws IOException; // INSERT - 공연 정보 추가
	void updateImgPath(PerformanceVO performance);
}
