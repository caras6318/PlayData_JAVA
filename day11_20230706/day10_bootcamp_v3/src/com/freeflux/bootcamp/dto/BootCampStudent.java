package com.freeflux.bootcamp.dto;

//cSeqNo int not null auto_increment,
//cName varchar(10) not null,    
//cRating char(4) not null,
//cJoinDate char(11),
//cLastDate char(11),
//cVisitNo int(1), 
//cPostNo int(1),
//cCommentNo int(1),
//cGender varchar(4) not null,
//cAge varchar(20) not null,

public class BootCampStudent {
	private int cSeqNo = 0;
	private String cName = "";    
	private String cRating = "멤버";
	private String cJoinDate = "";
	private String cLastDate = "";
	private int cVisitNo = 0; 
	private int cPostNo = 0;
	private int cCommentNo = 0;
	private String cGender = "";
	private String cAge = "";

	public BootCampStudent() {
	}

	// insert() 에서 사용
	public BootCampStudent(String cName, String cGender, String cAge) {
		this.cName =cName;
		this.cGender =cGender;
		this.cAge =cAge;
	}
	
	// selectAll() 에서 사용
	public BootCampStudent(int cSeqNo, String cName, String cRating, String cJoinDate, String cLastDate, int cVisitNO, int cPostNo, int cCommentNo, String cGender, String cAge) {
		this.cSeqNo =cSeqNo;
		this.cName =cName;
		this.cRating =cRating;
		this.cJoinDate =cJoinDate;
		this.cLastDate =cLastDate;
		this.cVisitNo =cVisitNO;
		this.cPostNo =cPostNo;
		this.cCommentNo =cCommentNo;
		this.cGender =cGender;
		this.cAge =cAge;
	}

	// selectKeyword() 에서 사용
		public BootCampStudent(int cSeqNo, String cName, String cGender) {
			this.cSeqNo =cSeqNo;
			this.cName =cName;
			this.cGender =cGender;
		}
	
	// update() 에서 사용
	public BootCampStudent(int cSeqNo, String cName, int cVisitNO) {
		this.cSeqNo =cSeqNo;
		this.cName =cName;
		this.cVisitNo =cVisitNO;
	}

	@Override
	public String toString() {
		return "BootCampStudent [cSeqNo=" + cSeqNo + ", cName=" + cName + ", cRating=" + cRating + ", cJoinDate="
				+ cJoinDate + ", cLastDate=" + cLastDate + ", cVisitNo=" + cVisitNo + ", cPostNo=" + cPostNo
				+ ", cCommentNo=" + cCommentNo + ", cGender=" + cGender + ", cAge=" + cAge + "]";
	}

	public int getcSeqNo() {
		return cSeqNo;
	}

	public void setcSeqNo(int cSeqNo) {
		this.cSeqNo = cSeqNo;
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

	public String getcGender() {
		return cGender;
	}

	public void setcGender(String cGender) {
		this.cGender = cGender;
	}

	public String getcAge() {
		return cAge;
	}

	public void setcAge(String cAge) {
		this.cAge = cAge;
	}

	
}
