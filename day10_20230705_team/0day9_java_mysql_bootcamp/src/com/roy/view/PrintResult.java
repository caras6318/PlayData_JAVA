package com.roy.view;

import java.util.ArrayList;

import com.roy.dto.BootCamp;

public class PrintResult {

	public PrintResult() {
	}

	public static void printSelectAll(ArrayList<BootCamp> emps) {
		for (BootCamp employee : emps) {
		System.out.println(employee);
		}
	}
	
	public static void printJobSelect() {
		System.out.println();
		System.out.println("원하는 작업 번호를 입력해 주세요..");
		System.out.println("1. 전체 레코드 조회 / 2. 성별 수정 / 3. 멤버 추가 / "
		+ "4. 평균 방문횟수 보다 많이 방문화 사람 명단 출력 / 5. 비공개인 사람들의 방문 횟수 각각 출력 / "
		+ "6. 작업 종료");
	}
}
