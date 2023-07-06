package com.freeflux.bootcamp.util;

import java.util.ArrayList;
import java.util.Scanner;

import com.freeflux.bootcamp.db.MySQLConnector;
import com.freeflux.bootcamp.dto.BootCampStudent;
import com.freeflux.bootcamp.view.PrintResult;

public class Utility {

	public Utility() {
	}
	
	// main() 에서 사용
	public static void initializeMenu() {
		MySQLConnector mysql = new MySQLConnector("db_bootcamp");
		mysql.connectMySQL();
		
		

		Scanner jobScan = new Scanner(System.in);
		boolean status = true;
		while (status) {
			PrintResult.printJobSelect();
			
			int selectMenuNo = jobScan.nextInt();

			/** MappingHandler (작업 요청 사항과 실행할 메서드를 Mapping) **/
			switch (selectMenuNo) {
			
			case 1:
				// 1. 전체 레코드 조회 출력
				mysql.selectAll();
				PrintResult.selectAll();

				break;

			case 2:
				// 2. 성별이 기타인 사람 성별 수정 (성별 입력 받아 수정)
				// 2-1. 성별이 기타인 사람 조회
				ArrayList<BootCampStudent> keywordList = mysql.selectGender("기타");

				// 2-2. 성별이 기타인 사람의 수정하ㄹ 성별 입력
				ArrayList<BootCampStudent> changedList = Utility.inputData(keywordList);

				// 2-3. 조회된 사람의 성별을 입력된 값으로 수정
				mysql.update(changedList);

				mysql.selectAll();
				PrintResult.selectAll();

				break;

			case 3:
				// 3. 멤버 추가 (이름, 성별, 연령대 입력받아 추가)
				BootCampStudent student = Utility.inputData();
				mysql.insert(student);

				mysql.selectAll();
				PrintResult.selectAll();

				break;

			case 4:
				// 4. 평균 방문횟수 보다 많이 방문한 사람 명단 출력
				// 4-1. 전체 데이터를 다시 조회
				mysql.selectAll();

				// 4-2. 전체 수강생의 평균 방문 횟수
				float vAvg = Utility.visitAvg();

				// 4-3. 평균 방문 횟수보다 많은 수강생 명단 조회
				ArrayList<BootCampStudent> visitList = mysql.selectOverAvg(vAvg);
				PrintResult.listAll(visitList, vAvg);

				break;

			case 5:
				// 5. 나이 비공개인 사람들의 방문 횟수 각각 출력
				String keyword = "비공개";
				ArrayList<BootCampStudent> ageNoneList = mysql.selectAgeNone(keyword);
				PrintResult.listAll(ageNoneList, keyword);

				break;

			case 6:
				// 6. 작업 종료
				status = false;
				break;
				
			} // switch() END
			
			
		} // while() END
		
		jobScan.close();
		System.out.println("작업이 종료 되었습니다..");
	}

	
	
	// case 3: 멤버 추가 (이름, 성별, 연령대 입력받아 추가)
	// String cName, String cGender, String cAge
 	public static BootCampStudent inputData() {
		System.out.println("해당 항목을 입력하세요");
		Scanner scan = new Scanner(System.in);

		System.out.println("이름을 입력해주세요..");
		System.out.println("=> ");
		String cName = scan.next();

		System.out.println("성별을 입력해주세요..");
		System.out.println("예) 남 / 여");
		System.out.println("=> ");
		String cGender = scan.next();

		System.out.println("연령을 입력해주세요..");
		System.out.println("예) 20 / 30 / 40 / 50 / 비공개");
		System.out.println("=> ");
		String cAgeNo = scan.next();

		String cAge = "";
		if (!cAgeNo.equals("비공개")) {
			System.out.println("연령대를 입력해주세요..");
			System.out.println("예)초반 / 중반 / 후반");
			System.out.println("=> ");
			cAge = scan.next();
			cAge = cAgeNo + "대 " + cAge;
		} else {
			cAge = cAgeNo;
		}
		//scan.close();
		return new BootCampStudent(cName, cGender, cAge);
	} // inputData() END
	
	
	//case 2: 성별이 기타인 사람 성별 수정 (성별 입력 받아 수정)
	// int cSeqNo, String cName, String cGender
	public static ArrayList<BootCampStudent> inputData(ArrayList<BootCampStudent> keywordList) {
		
		System.out.println("아래 이름의 성별을 입력하세요");
		Scanner scan = new Scanner(System.in);
		
		int idx=0;
		for(BootCampStudent student : keywordList) {
			
			System.out.println("예) 남 / 여");
			System.out.println(student.getcName() + " => ");
			String cGender = scan.next();
			
			student.setcGender(cGender);
			keywordList.set(idx, student);
			idx++;
		}

		return keywordList;
	} // inputData() END
	
	
	// case 4: 평균 방문횟수 보다 많이 방문한 사람 명단 출력
	// 평균 방문횟수
	public static float visitAvg() {
		int vSum = 0;
		
		for(BootCampStudent student : MySQLConnector.studentList) {
			vSum = vSum + student.getcVisitNo();
		}
		
		return (float)vSum / MySQLConnector.studentList.size();
	}
}
