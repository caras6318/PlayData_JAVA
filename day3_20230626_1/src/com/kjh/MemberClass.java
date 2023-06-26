package com.kjh;
// 한 회원의 정보를 하나로 묶어주는 역할
// Model역할
public class MemberClass {
	String pno = null; 		//교수사번
	String firstNo = null; 	//주민등록 앞자리
	String lastNo = null; 	//주민등록 뒷자리 
	String pname = null;	//교수 이름
	int cCode = 0;			//클래스(반코드)
	String pJob = null;		//교수직책
	int hireDate = 0;		//입사년도
	

	public MemberClass() {
		System.out.println("MemberClass 생성자 호출");
		
	}//7개의 데이터를 전달 받는 생성자
	//("92001", "590327-1839240", "이태규", 920, "교수", "1997")
	public MemberClass(String pno, String jumin, String name, int n, String job, String h) {
		this.pno = pno;
		String[] temp = jumin.split("-");
		this.firstNo = temp[0];
		this.lastNo = temp[1];
		this.pname = name;
		this.cCode = n;
		this.pJob = job;
		this.hireDate = Integer.parseInt(h);
		
	}

}
