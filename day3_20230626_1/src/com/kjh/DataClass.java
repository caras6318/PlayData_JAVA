package com.kjh;

//DataClass : 모든 회원의 정보를 보유하는 역할
//나중에 sql로 변경할거임

public class DataClass {
	
	MemberClass[] members = new MemberClass[6];
	
	public DataClass() {	
	
		init();
	}
	public void init() {	
		
		members[0] = new MemberClass("92001", "590327-1839240", "이태규", 920, "교수", "1997");
		members[1] = new MemberClass("92002", "690702-1350026", "고희석", 910, "부교수", "2003");
		members[2] = new MemberClass("92301", "741011-2765501", "최성희", 910, "부교수", "2005");
		members[3] = new MemberClass("92302", "750728-1102458", "김태석", 920, "교수", "1999");
		members[4] = new MemberClass("92501", "620505-1200546", "박철재", 900, "조교수", "2007");
		members[5] = new MemberClass("92502", "740101-1830264", "장민석", 910, "부교수", "2005");
		
	}

}






