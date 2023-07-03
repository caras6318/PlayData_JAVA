package com.kjh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		//1.mysql접속드라이버 로드
		try {		
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Success Load Drivers");
		}catch(ClassNotFoundException e) {
			System.out.println("xxx"+e.getMessage());
		}
		//2.mysql 서버 접속 주소/id/pw/db이름

		//서버주소 : jdbc:mysql:// 서버접속 프로토콜 
		//데이터 통신 게이트 ( 포트번호) : 3306
		//사용할 db명 : index5
		//서버주소 : jdbc:mysql://localhost:3306/index5
		//서버관리자 ID : root
		//서버관리자 PW : Gkgk6318gkgk!
		//접속결과를 저장하는변수 : Connection 변수명

		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/";
		String id = "root";
		String pw = "Gkgk6318gkgk!";
		String dbName = "index5";
		url = url + dbName;
		try {
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("Success Connect");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("SQLException" + e.getMessage());
		}
		//3. MySQL에 요청 : SQL : SQLException
		//	3-1.Statement : 쿼리문 내의 변수 처리를 하지않을 경우
		// 	3-2.PreparedStatement : 쿼리문 내의 변수가포함 될 경우 
		
		//4. 결과처리 : Select * from TableName : SQLExeption
		//			ResultSet객체로 전달받는다.
		//			while(ResultSet.next(){
		//					레코드(한줄) 하나씩
		//}
		
		//5.자원해제 
		//	5.1 ResultSet.close();
		// 	5.2 Statement.close(); or PreparedStatement.close();
		//	5.3 Connction.close(); 
	}

}//Driver.class => com.mtsql.jdbc.Driver : 접속드라이버 명 
