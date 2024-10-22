package com.spring_boot_dolls_ticket.project.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring_boot_dolls_ticket.project.model.PerformanceVO;
import com.spring_boot_dolls_ticket.project.model.ReviewVO;
import com.spring_boot_dolls_ticket.project.service.PerformanceService;
import com.spring_boot_dolls_ticket.project.service.ReviewService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class PerformanceController {

	@Autowired
	PerformanceService pfmservice;
	
	@Autowired
	ReviewService rvService;
	
	@RequestMapping("/performance/detailViewPerformance/{performanceId}")
	public String detailViewPerformance(@PathVariable String performanceId, Model model) {
		PerformanceVO pfm =pfmservice.detailViewPerformance(performanceId);
		model.addAttribute("pfm",pfm);
		ArrayList<ReviewVO> reviewList = rvService.reviewList(performanceId);
		model.addAttribute("reviewList", reviewList);
		return "performance/performanceDetail";
	}

	@RequestMapping("/performance/writeReview") 
	public String writeReview(ReviewVO vo, HttpSession session, HttpServletRequest request) {
	    // 세션에서 사용자 ID 가져오기
	    String custId = (String) session.getAttribute("sid");
	    vo.setCustId(custId); 
	    vo.setPerformanceId(request.getParameter("performanceId"));
	    rvService.insertReview(vo);
	    return "redirect:/performance/detailViewPerformance/"+vo.getPerformanceId();
	}
	
	@RequestMapping(value = "/performance/deleteReview", method = RequestMethod.POST)
	@ResponseBody
	public String deleteReview(@RequestParam("reviewSeq") int reviewSeq, ReviewVO vo, HttpServletRequest request) {
		vo.setPerformanceId(request.getParameter("performanceId"));
	    rvService.deleteReview(reviewSeq); // 리뷰 삭제 처리
	    return "redirect:/performance/detailViewPerformance/"+vo.getPerformanceId();
	    }

}
