package com.roy.dto;

public class BootCamp {
	private String cName = null;
	private String cRating = null;
	private String cJoinDate=null;
	private String cLastDate=null;
	private int cVisitNo=0;
	private int cPostNo=0;
	private int cCommentNo=0;
	private String cGenger=null;
	private String cAge=null;

	public BootCamp() {
	}

	public BootCamp(String cName, String cRating, String cJoinDate, String cLastDate, int cVisitNo, int cPostNo, int cCommentNo ,String cGenger, String cAge) {
		this.cName = cName;
		this.cRating = cRating;
		this.cJoinDate = cJoinDate;
		this.cLastDate = cLastDate;
		this.cVisitNo = cVisitNo;
		this.cPostNo = cPostNo;
		this.cCommentNo = cCommentNo;
		this.cGenger = cGenger;
		this.cAge = cAge;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcRating() {
		return cRating;
	}

	public void setcRating(String cRating) {
		this.cRating = cRating;
	}

	public String getcJoinDate() {
		return cJoinDate;
	}

	public void setcJoinDate(String cJoinDate) {
		this.cJoinDate = cJoinDate;
	}

	public String getcLastDate() {
		return cLastDate;
	}

	public void setcLastDate(String cLastDate) {
		this.cLastDate = cLastDate;
	}

	public int getcVisitNo() {
		return cVisitNo;
	}

	public void setcVisitNo(int cVisitNo) {
		this.cVisitNo = cVisitNo;
	}

	public int getcPostNo() {
		return cPostNo;
	}

	public void setcPostNo(int cPostNo) {
		this.cPostNo = cPostNo;
	}

	public int getcCommentNo() {
		return cCommentNo;
	}

	public void setcCommentNo(int cCommentNo) {
		this.cCommentNo = cCommentNo;
	}

	public String getcGenger() {
		return cGenger;
	}

	public void setcGenger(String cGenger) {
		this.cGenger = cGenger;
	}

	public String getcAge() {
		return cAge;
	}

	public void setcAge(String cAge) {
		this.cAge = cAge;
	}

	@Override
	public String toString() {
		return "BootCamp [cName=" + cName + ", cRating=" + cRating + ", cJoinDate=" + cJoinDate + ", cLastDate="
				+ cLastDate + ", cVisitNo=" + cVisitNo + ", cPostNo=" + cPostNo + ", cCommentNo=" + cCommentNo
				+ ", cGenger=" + cGenger + ", cAge=" + cAge + "]";
	}
	
}
	
	