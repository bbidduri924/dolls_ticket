package com.spring_boot_dolls_ticket.project.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.spring_boot_dolls_ticket.project.dao.ITransferDAO;
import com.spring_boot_dolls_ticket.project.model.AssignmentNoticeBoardVO;
import com.spring_boot_dolls_ticket.project.model.AssignmentTicketVO;
import com.spring_boot_dolls_ticket.project.model.Transfer2VO;
import com.spring_boot_dolls_ticket.project.model.TransferReservationInfoVO;
import com.spring_boot_dolls_ticket.project.model.TransferVO;

@Service
public class TransferService implements ITransferService{

	@Autowired
	@Qualifier("ITransferDAO")
	ITransferDAO tdao;

	@Override
	public ArrayList<TransferVO> showTransInfo(String custId) {
		return tdao.showTransInfo(custId);
	}

	@Override
	public void insertAssignmentNotice(AssignmentNoticeBoardVO vo) {
		
		String noticeId=tdao.maxNoticeId();
		vo.setNoticeId(noticeId);
		
		tdao.insertAssignmentNotice(vo);
		
		
		String[] arr = vo.getReservationNumber();
		
		for(int i=0; i < arr.length; i++) {
			AssignmentTicketVO ticketvo = new AssignmentTicketVO();
			ticketvo.setNoticeId(noticeId);
			ticketvo.setReservationNumber(arr[i]);
			
			TransferReservationInfoVO infovo = new TransferReservationInfoVO();
			infovo.setReservationNumber(arr[i]);
			infovo.setCustId(vo.getCustId());
			infovo = tdao.selectSeatInfo(infovo);
			
			ticketvo.setPerformanceId(infovo.getPerformanceId());
			ticketvo.setReservationSeatInformation(infovo.getReservationSeatInformation());
			
			tdao.insertAssignmentTicket(ticketvo);
		}
		
		
	}

	@Override
	public ArrayList<AssignmentNoticeBoardVO> selectAssignmentNotice() {
		
		return tdao.selectAssignmentNotice();
	}

	@Override
	public HashMap<String, Object> selectAssignmentNotice(String noticeId) {

		HashMap<String, Object> map = new HashMap<String, Object>();
		
		AssignmentNoticeBoardVO nb = tdao.selectAssignmentNotice(noticeId);
		
		ArrayList<Transfer2VO> t2 = tdao.selectListTicketAndPerformance(noticeId);
		
		map.put("nb", nb);
		map.put("list", t2);
		
		return map;
	}

	@Override
	public int updateHit(String noticeId) {
		int hit=tdao.updateHit(noticeId);
		return hit;
	}

	@Override
	public int updateAssignmentTicket(AssignmentTicketVO ticketVo) {
		int ticketUpdate = tdao.updateAssignmentTicket(ticketVo);
		
		String receiveCustId=ticketVo.getReceiveCustId();
		String performanceId=ticketVo.getPerformanceId();
		String seatInfo=ticketVo.getReservationSeatInformation();  
		
		int custIdUpdate=tdao.updateCustId(receiveCustId, performanceId, seatInfo);
		
		return ticketUpdate;
	}

	
	
	

	
	

	
	
	
}