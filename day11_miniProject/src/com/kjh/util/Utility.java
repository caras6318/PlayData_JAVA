package com.kjh.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

import com.kjh.data.Cocktails;
import com.kjh.db.MySQLConnector;
import com.kjh.view.PrintRes;

public class Utility {

	public Utility() {
	}
	
	public static void initializeMenu() throws IOException {
		MySQLConnector mysql = new MySQLConnector("Cocktails");
		mysql.connectMySQL();
		
		ArrayList<Cocktails> ckList = new ArrayList<Cocktails>();

		Scanner jobScan = new Scanner(System.in);
		boolean status = true;
		while (status) {
			PrintRes.printStart();
			
			int selectMenuNo = jobScan.nextInt();

			/** MappingHandler (작업 요청 사항과 실행할 메서드를 Mapping) **/
			switch (selectMenuNo) {
			
			case 1:
				// 1. 전체 레코드 조회 출력
				mysql.select();
				PrintRes.select();

				break;
			case 2:
				break;
			case 3:
				Cocktails ckr = Utility.inputData();
				mysql.insert(ckr);
				
				mysql.select();
				PrintRes.select();
				break;

			case 5:
				// 5. 작업 종료
				status = false;
				break;
				
			} // switch() END
			
			
		} // while() END
		
		jobScan.close();
		System.out.println("작업이 종료 되었습니다..");
	}
	public static Cocktails inputData() throws IOException {//"insert into ckIBA (cImgUrl, cRUrl, cName, cIn , cMeth, cGar) values (?,?,?,?,?,?)";
		
		
		System.out.println("해당 항목을 입력하세요");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		Scanner scan = new Scanner(System.in);

		System.out.println("칵테일이름을 입력해주세요..");
		System.out.println("예)Alexander");
		System.out.print("=> ");
		String cName = br.readLine();
//		String cName = scan.next();
		
		System.out.println("칵테일재료를 입력해주세요..");
		System.out.println("예)30 ml Cognac 30 ml Crème de Cacao (Brown) 30 ml Fresh Cream");
		System.out.print("=> ");
		String cIn = br.readLine();
//		String cIn = scan.next();
		
		System.out.println("칵테일 만드는 방법을 입력해주세요..");
		System.out.println("예) Pour all ingredients into cocktail shaker filled with ice cubes. Shake and strain into a chilled cocktail glass.");
		System.out.print("=> ");
		String cMeth = br.readLine();
//		String cMeth = scan.next();
		
		System.out.println("칵테일 가니쉬를 입력해주세요..");
		System.out.println("예) Sprinkle fresh ground nutmeg on top / 없음");
		System.out.print("=> ");
		String cGar = br.readLine();
//		String cGar = scan.next();
		

		//scan.close();
		return new Cocktails (cName, cIn , cMeth, cGar);
	} // inputData() 
	
	
	
}
