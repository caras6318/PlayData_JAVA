package com.kjh;

public class StudentClass {
	
	String sNo = null; 		//학생번호
	String firstNo = null; 	//주민등록 앞자리
	String lastNo = null; 	//주민등록 뒷자리 
	String sName = null;	//교수 이름
	int year = 0;			//클래스(반코드)
	String local = null;	//교수직책
	int Grade = 0;			//입사년도
	

	public StudentClass() {
		// TODO Auto-generated constructor stub
	}
	public StudentClass(String sNo, String jumin, String sName, int year, String local, int grade) {
		this.sNo = sNo;
		String[] temp = jumin.split("-");
		this.firstNo = temp[0];
		this.lastNo = temp[1];
		this.sName = sName;
		this.year = year;
		this.local = local;
		this.Grade = grade;
		
	}
}
