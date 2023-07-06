package com.freeflux.bootcamp.view;

import java.util.ArrayList;

import com.freeflux.bootcamp.db.MySQLConnector;
import com.freeflux.bootcamp.dto.BootCampStudent;

public class PrintResult {
//	private String tagStartHtml ="<!doctype html><html><head><title>";
//	private String tagTitle ="</title></head><body>";
//	private String tagBody = null;
//	private String tagEndHtml ="</body></html>";
	
	public PrintResult() {
	}
	
//	public PrintResult(String title) {
//		this.tagStartHtml = this.tagStartHtml + title + this.tagTitle;
//	}
	
	public static void printJobSelect() {
		System.out.println();
		System.out.println("메뉴를 선택해주세요..");
		System.out.println("=> 1. 전체 레코드 조회 출력");
		System.out.println("=> 2. 성별이 기타인 사람 성별 수정");
		System.out.println("=> 3. 멤버 추가");
		System.out.println("=> 4. 평균 방문횟수 보다 많이 방문한 사람 명단 출력");
		System.out.println("=> 5. 나이 비공개인 사람들의 방문 횟수 각각 출력");
		System.out.println("=> 6. 작업 종료");
		System.out.println("=> ");
	}

	public static void selectAll() {
		System.out.println("======================================");
		System.out.println(" 전체 수강생 데이터 ");
		System.out.println("--------------------------------------");
		for(BootCampStudent student : MySQLConnector.studentList) {
			System.out.println(student);
		}
	}
	
	public static void listAll(ArrayList<BootCampStudent> visitList, float vAvg) {
		System.out.println("======================================");
		System.out.println("평균 방문 횟수 : " + vAvg);
		System.out.println("--------------------------------------");
		for(BootCampStudent student :  visitList) {
			System.out.println(student.getcSeqNo() + "\t" + student.getcName() + "\t" + student.getcVisitNo());
		}
	}
	
	public static void listAll(ArrayList<BootCampStudent> ageNoneList, String keyword) {
		System.out.println("======================================");
		System.out.println("나이를 \' " + keyword + " \' 한 수강생들");
		System.out.println("--------------------------------------");
		for(BootCampStudent student :  ageNoneList) {
			System.out.println(student.getcSeqNo() + "\t" + student.getcName() + "\t" + student.getcVisitNo());
		}
	}
	
	
//	public static void selectAllForHTML() {
//			for(BootCampStudent student : MySQLConnector.studentList) {
//			System.out.println(student);
//		}
//	}
}
