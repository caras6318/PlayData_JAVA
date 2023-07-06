package com.roy.util;

import java.util.ArrayList;
import java.util.Scanner;
import com.roy.db.MySQLconnector;
import com.roy.dto.BootCamp;
import com.roy.view.PrintResult;

public class UtilClass {

	public UtilClass() {
	}

	public static void ee() {
		MySQLconnector mysql = new MySQLconnector();
		mysql.connectMySQL();
		
		Scanner scan = new Scanner(System.in);
		boolean status = true;
		ArrayList<BootCamp> empList = null;

		// *
		while (status) {

			int no = scan.nextInt();
			switch (no) {
			case 1:
				System.out.println();
				System.out.println("전체 레코드 조회");
				empList = mysql.selectAll();
				PrintResult.printSelectAll(empList);

				PrintResult.printJobSelect();
				break;
			case 2:
				System.out.println();
				System.out.println("성별이 기타인 사람 성별 수정");
				mysql.();
				empList = mysql.selectAll();
				PrintResult.printSelectAll(empList);

				PrintResult.printJobSelect();
				break;
			case 3:
				System.out.println();
				System.out.println("멤버 추가 성공");
				empList = UtilClass.payRaise(empList, 10);
				empList = mysql.update(empList);
				PrintResult.printSelectAll(empList);

				PrintResult.printJobSelect();
				break;
			case 4:
				System.out.println();
				System.out.println("평균 방문횟수 보다 많이 방문화 사람 명단 출력");
				mysql.delete();
				empList = mysql.selectOneQ4();
				PrintResult.printSelectAll(empList);
				
				PrintResult.printJobSelect();
				break;
			case 5:
				System.out.println();
				System.out.println("나이 비공개인 사람들의 방문 횟수 각각 출력");
				mysql.delete();
				empList = mysql.selectAll();
				PrintResult.printSelectAll(empList);
				
				PrintResult.printJobSelect();
				break;
			case 6:
				status = false;
				break;
			}
		}
		scan.close();
		System.out.println("작업이 종료 되었습니다..");
	}
	
	public static ArrayList<BootCamp> payRaise(ArrayList<BootCamp> empList, float n) {
		float raise = n /100;
		System.out.println(raise);
		
//		for(BootCamp employee : empList) {
//			float raise1 = employee.getSale() * raise;
//			float raise2 = employee.getSale() + raise1;
//			employee.setSale((int)raise2);
		
		return empList;
	}
}
