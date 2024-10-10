package com.spring_boot_dolls_ticket.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring_boot_dolls_ticket.project.model.PerformanceVO;
import com.spring_boot_dolls_ticket.project.service.PerformanceService;

@Controller
public class PerformanceController {

	@Autowired
	PerformanceService pfmservice;
	
	@RequestMapping("/performance/detailViewPerformance/{performanceId}")
	public String detailViewPerformance(@PathVariable String performanceId, Model model) {
		PerformanceVO pfm =pfmservice.detailViewPerformance(performanceId);
		
		model.addAttribute("pfm",pfm);
		
		return "performance/performanceDetail";
	}
	
	
}
