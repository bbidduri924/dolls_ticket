package com.spring_boot_dolls_ticket.project.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class PerformanceVO {
	
	private String performanceId;
	private String performanceKindCd;
	private int performanceRatingCode;
	private String performanceName;
	private int performancePriceR;
	private int performancePriceS;
	private String performanceZipcode;
	private String performanceAddress;
	private String performanceDetailAddress;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date performanceDate1;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date performanceDate2;
	private int performanceTime;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date reservationOpenExpectedDate;
	private String performanceImagePath;
	private String performanceInformationImagePath;
	private Date firstChangeDate;
	private Date lastChangeDate;
	
	public String getPerformanceId() {
		return performanceId;
	}
	public void setPerformanceId(String performanceId) {
		this.performanceId = performanceId;
	}
	public String getPerformanceKindCd() {
		return performanceKindCd;
	}
	public void setPerformanceKindCd(String performanceKindCd) {
		this.performanceKindCd = performanceKindCd;
	}
	public int getPerformanceRatingCode() {
		return performanceRatingCode;
	}
	public void setPerformanceRatingCode(int performanceRatingCode) {
		this.performanceRatingCode = performanceRatingCode;
	}
	public String getPerformanceName() {
		return performanceName;
	}
	public void setPerformanceName(String performanceName) {
		this.performanceName = performanceName;
	}
	public int getPerformancePriceR() {
		return performancePriceR;
	}
	public void setPerformancePriceR(int performancePriceR) {
		this.performancePriceR = performancePriceR;
	}
	public int getPerformancePriceS() {
		return performancePriceS;
	}
	public void setPerformancePriceS(int performancePriceS) {
		this.performancePriceS = performancePriceS;
	}
	public String getPerformanceZipcode() {
		return performanceZipcode;
	}
	public void setPerformanceZipcode(String performanceZipcode) {
		this.performanceZipcode = performanceZipcode;
	}
	public String getPerformanceAddress() {
		return performanceAddress;
	}
	public void setPerformanceAddress(String performanceAddress) {
		this.performanceAddress = performanceAddress;
	}
	public String getPerformanceDetailAddress() {
		return performanceDetailAddress;
	}
	public void setPerformanceDetailAddress(String performanceDetailAddress) {
		this.performanceDetailAddress = performanceDetailAddress;
	}
	public Date getPerformanceDate1() {
		return performanceDate1;
	}
	public void setPerformanceDate1(Date performanceDate1) {
		this.performanceDate1 = performanceDate1;
	}
	public Date getPerformanceDate2() {
		return performanceDate2;
	}
	public void setPerformanceDate2(Date performanceDate2) {
		this.performanceDate2 = performanceDate2;
	}
	public int getPerformanceTime() {
		return performanceTime;
	}
	public void setPerformanceTime(int performanceTime) {
		this.performanceTime = performanceTime;
	}
	public Date getReservationOpenExpectedDate() {
		return reservationOpenExpectedDate;
	}
	public void setReservationOpenExpectedDate(Date reservationOpenExpectedDate) {
		this.reservationOpenExpectedDate = reservationOpenExpectedDate;
	}
	public String getPerformanceImagePath() {
		return performanceImagePath;
	}
	public void setPerformanceImagePath(String performanceImagePath) {
		this.performanceImagePath = performanceImagePath;
	}
	public String getPerformanceInformationImagePath() {
		return performanceInformationImagePath;
	}
	public void setPerformanceInformationImagePath(String performanceInformationImagePath) {
		this.performanceInformationImagePath = performanceInformationImagePath;
	}
	public Date getFirstChangeDate() {
		return firstChangeDate;
	}
	public void setFirstChangeDate(Date firstChangeDate) {
		this.firstChangeDate = firstChangeDate;
	}
	public Date getLastChangeDate() {
		return lastChangeDate;
	}
	public void setLastChangeDate(Date lastChangeDate) {
		this.lastChangeDate = lastChangeDate;
	}
	
}