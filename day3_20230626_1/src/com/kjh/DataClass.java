package com.kjh;

//DataClass : 모든 회원의 정보를 보유하는 역할
//나중에 sql로 변경할거임

public class DataClass {
	
	MemberClass[] members = new MemberClass[6];
	StudentClass[] students = new StudentClass[8];
	
	public DataClass() {	
	
		this.init();
		this.initStudent();
	}
	public void init() {	
		
		members[0] = new MemberClass("92001", "590327-1839240", "이태규", 920, "교수", "1997");
		members[1] = new MemberClass("92002", "690702-1350026", "고희석", 910, "부교수", "2003");
		members[2] = new MemberClass("92301", "741011-2765501", "최성희", 910, "부교수", "2005");
		members[3] = new MemberClass("92302", "750728-1102458", "김태석", 920, "교수", "1999");
		members[4] = new MemberClass("92501", "620505-1200546", "박철재", 900, "조교수", "2007");
		members[5] = new MemberClass("92502", "740101-1830264", "장민석", 910, "부교수", "2005");
		
		
	}
public void initStudent() {	
		
		students[0] = new StudentClass("1292001", "900424-1825409", "김광식", 3, "서울", 92);
		students[1] = new StudentClass("1292002", "900305-1730021", "김정현", 3, "서울", 20);
		students[2] = new StudentClass("1292003", "891021-2308302", "김현정", 4, "대전", 55);
		students[3] = new StudentClass("1292301", "890902-2704012", "김현정", 2, "대구", 78);
		students[4] = new StudentClass("1292303", "910715-1524390", "박광수", 3, "광주", 54);
		students[5] = new StudentClass("1292305", "921011-1809003", "김우주", 4, "부산", 88);
		students[6] = new StudentClass("1292501", "900825-1506390", "박철수", 3, "대전", 73);
		students[7] = new StudentClass("1292502", "911011-1809003", "백태성", 3, "서울", 95);

		
	}

}






