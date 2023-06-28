package com.kjh;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
//		String test ="임재,20190509,20190510,8,남,30대후반";
//		String[] split = test.split(",");
//		
//		String date1 = split[1];
//		System.out.println(date1);
//		String year = date1.substring(0,4);
//		System.out.println(year);
//--------------------------------------------------
//		new EMPClass();
//		EMPClass emp1 = new EMPClass();
//		emp1.name = "임재";
//		emp1.joinDate = "20190509";
//		emp1.lastVisitDate = "20190510";
//		emp1.numVisit = Integer.parseInt("8");
//		emp1.age = "30대후반";
//		
//		EMPClass emp2 = new EMPClass();
//		emp2.name = "성";
//		emp1.joinDate = "20190509";
//		emp1.lastVisitDate = "20190510";
//		emp1.numVisit = Integer.parseInt("30");
//		emp1.age = "30대중반";
//		
//		System.out.println(emp1.name);
//		System.out.println(emp2.name);
// 
//	데이터가 많아질수록 위와같은 방법은 비효율적
//-----------------------------------------------------
//		EMPClass emp1 = new EMPClass("임재,20190509,20190510,8,남,30대후반");
//		EMPClass emp2 = new EMPClass("성열,20190509,20190510,1,남,30대중반");
		ArrayList<EMPClass> member=new ArrayList<EMPClass>();


				member.add(new EMPClass("임재,20190509,20190510,8,남,30대후반"));
				member.add(new EMPClass("성열,20190509,20190510,1,남,30대중반"));
				member.add(new EMPClass("천재,20190509,20190510,3,남,30대초반"));
				member.add(new EMPClass("현수,20190509,20190509,1,남,20대후반"));
				member.add(new EMPClass("진우,20190509,20190510,2,남,30대초반"));
				member.add(new EMPClass("영주,20190509,20190510,2,비공개,비공개"));
				member.add(new EMPClass("종화,20190509,20190509,0,남,20대후반"));
				member.add(new EMPClass("윤정,20190509,20190510,3,비공개,비공개"));
				member.add(new EMPClass("종호,20190509,20190510,3,남,20대중반"));
				member.add(new EMPClass("동현,20190509,20190510,5,남,20대중반"));
				member.add(new EMPClass("경래,20190509,20190510,1,남,20대후반"));
				member.add(new EMPClass("상일,20190509,20190510,6,남,30대후반"));
				member.add(new EMPClass("재형,20190509,20190510,2,남,30대중반"));
				member.add(new EMPClass("경민,20190509,20190510,4,남,20대중반"));
				member.add(new EMPClass("경애,20190507,20190507,0,비공개,비공개"));
				member.add(new EMPClass("동현,20190507,20190507,0,남,40대초반"));
				member.add(new EMPClass("종인,20190507,20190507,0,남,40대중반"));
				member.add(new EMPClass("은혁,20190426,20190504,3,남,30대후반"));
				member.add(new EMPClass("은정,20190426,20190426,1,여,30대중반"));
				member.add(new EMPClass("정은,20190426,20190426,0,여,40대후반"));
				member.add(new EMPClass("진수,20190426,20190426,1,비공개,비공개"));
				member.add(new EMPClass("은석,20190426,20190504,2,남,50대초반"));
				member.add(new EMPClass("수진,20190426,20190426,0,여,30대초반"));
				member.add(new EMPClass("비공개,20190426,20190426,1,비공개,비공개"));
				member.add(new EMPClass("재희,20190426,20190426,2,여,40대후반"));
				member.add(new EMPClass("의환,20190426,20190426,1,남,20대후반"));
				member.add(new EMPClass("관현,20190425,20190425,0,남,40대초반"));
				member.add(new EMPClass("성욱,20190425,20190426,3,남,30대후반"));
				member.add(new EMPClass("의열,20190425,20190426,5,여,30대후반"));
				member.add(new EMPClass("가영,20190425,20190426,1,여,30대중반"));
				member.add(new EMPClass("현수,20190425,20190505,5,남,40대초반"));
				member.add(new EMPClass("기대,20190425,20190426,2,남,40대중반"));
				member.add(new EMPClass("근준,20190425,20190425,0,남,20대후반"));
				member.add(new EMPClass("성준,20190425,20190426,3,남,20대후반"));
				member.add(new EMPClass("종오,20190425,20190426,3,남,50대중반"));
				member.add(new EMPClass("병욱,20190425,20190426,5,남,30대초반"));
				member.add(new EMPClass("서경,20190425,20190426,2,여,30대후반"));
				member.add(new EMPClass("비공개,20190425,20190426,1,비공개,비공개"));
				member.add(new EMPClass("관순,20190425,20190426,3,여,30대초반"));
				member.add(new EMPClass("충현,20190425,20190426,1,남,30대초반"));
				member.add(new EMPClass("시형,20190425,20190426,1,남,30대후반"));
				member.add(new EMPClass("정윤,20190425,20190426,3,여,30대중반"));
				member.add(new EMPClass("호섭,20190425,20190426,1,남,40대후반"));
				member.add(new EMPClass("상민,20190425,20190426,1,남,30대중반"));
				member.add(new EMPClass("수영,20190425,20190426,1,여,30대중반"));
				member.add(new EMPClass("경훈,20190425,20190426,1,비공개,비공개"));
				member.add(new EMPClass("남현,20190218,20190510,10,남,30대후반"));
				member.add(new EMPClass("두근,20190218,20190218,0,남,20대중반"));
				member.add(new EMPClass("윤정,20181022,20190114,18,여,20대후반"));
				member.add(new EMPClass("현민,20181022,20190115,31,남,20대후반"));
				member.add(new EMPClass("철우,20181011,20181024,7,남,30대초반"));
				member.add(new EMPClass("동주,20181011,20190324,75,남,20대후반"));
				member.add(new EMPClass("승민,20181002,20181208,48,남,20대중반"));
				member.add(new EMPClass("근학,20180927,20190129,45,남,20대후반"));
				member.add(new EMPClass("수민,20180927,20190412,50,남,20대후반"));
				member.add(new EMPClass("형석,20180927,20190418,7,남,20대후반"));
				member.add(new EMPClass("명재,20180927,20190118,41,남,30대초반"));
				member.add(new EMPClass("병호,20180927,20181008,3,남,50대초반"));
				member.add(new EMPClass("민태,20180927,20190208,49,남,20대중반"));
				member.add(new EMPClass("신혜,20180927,20190120,49,여,20대후반"));
				member.add(new EMPClass("성권,20180927,20180928,5,남,20대후반"));
				member.add(new EMPClass("영봉,20180927,20181217,45,남,20대후반"));
				member.add(new EMPClass("성구,20180927,20190123,47,남,20대후반"));
				member.add(new EMPClass("부욱,20180927,20181119,24,남,30대초반"));
				member.add(new EMPClass("주현,20180712,20180712,2,여,20대초반"));
				member.add(new EMPClass("다희,20180626,20180626,1,여,20대중반"));
				member.add(new EMPClass("다을,20180625,20180807,40,여,20대중반"));
				member.add(new EMPClass("대희,20180625,20181217,57,남,20대중반"));
				member.add(new EMPClass("자훈,20180625,20190305,47,여,20대중반"));
				member.add(new EMPClass("지원,20180625,20180727,38,여,20대중반"));
				member.add(new EMPClass("재학,20180625,20181101,45,남,20대중반"));
				member.add(new EMPClass("지혜,20180625,20190410,89,여,20대중반"));
				member.add(new EMPClass("중훈,20180625,20180727,31,남,20대중반"));
				member.add(new EMPClass("한솔,20180625,20181205,62,여,20대중반"));
				member.add(new EMPClass("예림,20180625,20181227,28,여,20대중반"));
				member.add(new EMPClass("수현,20180625,20190210,17,여,20대중반"));
				member.add(new EMPClass("소현,20180625,20180727,63,여,20대중반"));
				member.add(new EMPClass("해성,20180625,20180726,38,남,20대후반"));
				member.add(new EMPClass("진안,20180625,20180727,45,남,20대후반"));
				member.add(new EMPClass("지원,20180625,20180726,17,여,20대초반"));
				member.add(new EMPClass("경희,20180625,20190424,27,여,20대중반"));
				member.add(new EMPClass("도형,20180625,20190504,72,남,20대후반"));
				member.add(new EMPClass("태수,20180625,20180808,70,남,20대중반"));
				member.add(new EMPClass("가은,20180625,20180807,42,여,20대중반"));
				member.add(new EMPClass("힘찬,20180625,20180727,33,남,20대중반"));
				member.add(new EMPClass("상협,20180625,20181025,43,남,20대중반"));
				member.add(new EMPClass("용선,20180625,20190102,66,남,20대중반"));
				member.add(new EMPClass("승현,20180625,20181206,50,남,20대중반"));
				member.add(new EMPClass("지원,20180625,20180723,16,여,20대중반"));
				member.add(new EMPClass("한진,20180419,20180719,47,남,20대후반"));
				member.add(new EMPClass("유찬,20180419,20181017,71,남,20대후반"));
				member.add(new EMPClass("기태,20180419,20180813,39,남,20대후반"));
				member.add(new EMPClass("지훈,20180419,20190209,34,남,20대후반"));
				member.add(new EMPClass("봉기,20180419,20181002,71,남,20대후반"));
				member.add(new EMPClass("정규,20180419,20180627,39,남,20대초반"));
				member.add(new EMPClass("상준,20180419,20181228,95,남,20대후반"));
				member.add(new EMPClass("유림,20180419,20180701,53,여,20대후반"));
				member.add(new EMPClass("소영,20180419,20180615,44,여,20대후반"));

		
		int num = member.size();
		ArrayList<EMPClass> emp = new ArrayList<EMPClass>();
		
		for(int i = 0; i < num; i++) {
			emp.add((member.get(i)));
		}
		for(int i = 0; i < num; i++) {
			System.out.println(emp.get(i).name);
			//회원의 성비를 구하시오
			//남녀 각각의 비율
		}
		int F = 0;
		int M = 0;
		for(int i = 0; i < num; i++) {
			if(member.get(i).gender.contains("남")) {
				M += 1;
			}else {
				F += 1;
			}
		
		
		
		}
		System.out.println("여자는 " + F + "명");
		System.out.println("여자는 " + M + "명");
	}
}
