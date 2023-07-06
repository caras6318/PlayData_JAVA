package com.kjh.view;

import com.kjh.data.Cocktails;
import com.kjh.db.MySQLConnector;

public class PrintRes {

	public PrintRes() {
	}
	public static void printStart() {
		System.out.println();
		System.out.println("원하시는 작업을  선택해주세요...");
		System.out.println("=> 1. 전체 레코드 조회 출력");
		System.out.println("=> 2. 칵테일 추천받기_제공되는 레시피는 IBA기준입니다.");
		System.out.println("=> 3. 나만의 칵테일 레시피 추가");
		System.out.println("=> 5. 작업 종료");
		System.out.println("=> ");
	}
	public static void select() {
		System.out.println("======================================");
		System.out.println(" 전체 레시피 데이터 ");
		System.out.println("--------------------------------------");
		for(Cocktails cock : MySQLConnector.ckList) {
			System.out.println(cock);
		}

	}
}
