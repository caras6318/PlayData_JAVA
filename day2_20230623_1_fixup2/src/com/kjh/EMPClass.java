package com.kjh;

public class EMPClass {//클래스 선언 
	String name;			//이름
	String joinDate;		//가입일
	String lastVisitDate;	//최종방문일
	String gender;			//성별
	String age;				//연령대
	int numVisit;			//방문횟수
//"임재,20190509,20190510,8,남,30대후반" 데이터가들어오게 될꺼임
	
public EMPClass() {//	기본생성자
	
}

		
public EMPClass(String str) {// 기본생성자에대하 OverLoading 생성자 선언
	this.setSplit(str);
}


//문자열을 각각 분리해서 전역(필드)변수에 설정(대입)하는 메서드
public void  setSplit(String str) {
	
	String[] split = str.split(",");
	this.name = split[0];
	this.joinDate = split[1];
	this.lastVisitDate = split[2];
	this.numVisit = Integer.parseInt(split[3]);
	this.gender = split[4];
	this.age = split[5]; //여기서는for문을 사용할수없다
		
	}

}
