package com.kjh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.kjh.db.MySQLconnector;

public class EmployeeMain {

	public static void main(String[] args) throws IOException {
		MySQLconnector mysql = new MySQLconnector();
		mysql.connectMySQL();
		boolean b = true;
		while(b) {
			System.out.println("원하시는 작업 번호를 입력해 주세요.");
			System.out.println("1.전체사원조회 / 2.신규사원추가 / 3.전사원 급여 10%인상 / 4.과장직책 사원 삭제 / 5.작업 종료 ");
			System.out.print("========>");
			
			Scanner sc = new Scanner(System.in);
			int lay = 0;
			lay = sc.nextInt();
//			sc.close();
			
			switch(lay) {
				case 1://clear
					mysql.selectEmp();
					break;
				case 2:
					String tmp = null;
					System.out.print("새로운 사원정보를 입력해주세요. ");
					try {
						BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
						tmp = br.readLine(); 
//						br.close();
					}catch(IOException e) {
						System.out.println("sss"+e.getMessage());
					}
					tmp = tmp.replaceAll("[();\\s\']","");
//					System.out.print(tmp);
					NewEmpData ned = new NewEmpData(tmp);
//					System.out.println(ned.nE.get(0).empNo);
					mysql.insertEmp(ned.nE);
					break;
				case 3:
					mysql.updateEmp();
					break;
				case 4:
					mysql.deleteEmp();
					break;
				case 5:
					System.out.println("작업을 종료합니다. ");
					b = false;
					break;
					
					
					
			}	
		}
	}
}


