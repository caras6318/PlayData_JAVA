package com.kjh.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLconnector {
	
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/index5?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
	private String id_mysql = "root";
	private String pw_mysql = "Gkgk6318gkgk!";
	
	public Connection conn = null;

	public MySQLconnector() {
		// TODO Auto-generated constructor stub
	}
//java에서 SQL을 MySQL 에 요청하는방법
	// Statement 객체생성 : 쿼리내부에 변수가 없을경우 반드시 현재 연결(접속)되어있는 Connection객체를통해서 생성한다 
//	Statement stmt = conn.createStatement();
//	ResultSet rst = stmt.executeQuery("select * from member");//메서드 내부에 쿼리문이 들어감 
//	int n1 = stmt.executeUpdate("insert into member valuse(1, 'sss')");
//	int n2 = stmt.executeUpdate("update member set id=3 where name='kjh'");
//	int n3 = stmt.executeUpdate("delete form member where id=3");
//	
//	//PreparedStatement 객체생성 : 쿼리내부에 변수가 없을경우
//	PreparedStatement pstmt = conn.prepareStatement("Query");
//	//ex) int idx = 3; // member 테이블로부터 id가 3인 레코드 조회
//	String Query = "select * from member where id = ?";
//	PreparedStatement pstmt = conn.prepareStatement(query);
//	pstmt.setInt(i, idx);
//	ResultSet rst = pstmt.executeQuery();
//	//ex) 	int idx= 5; 
//	///		String name "LES";
//	//		
//	//		Stirng query = "insert into member values( ? , ? )";
//	//		PreparedStatement pstmt = conn.preparedStatement(query);
//	//		pstmt.setInt(1,idx);
//	//
//	//
//	
//	
//	
//	
//	//공통 메서드 :
//	ResultSet rst = executeQuery();
//	while(rsey1.next()){//데이터를 확인 
//		rst.getInt("필드명");
//		rst.getString("필드명"));
//	//필드명 대신 인덱스 번호도 사용가능 단 여기서는 1부터 시작한다 
//	}
//	int n = excuteUpdate(); 
//	if(n>0){
//		System.out.print("Success");
//	}
	public void selectALL() { // 테이블 데이터 전체조회 select * from member
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from member");
			while(rs.next()){
				//System.out.println(rs.getInt("id"));
				System.out.println(rs.getInt("id") + "\t" + rs.getString("name"));
			}
			rs.close();
			stmt.close();
		}catch(SQLException e) {
			System.out.println("select * from member " + e.getMessage());
		}finally{
			try {
				rs.close();
				stmt.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				System.out.println("close ERR" + e1.getMessage());
			}
		}
		
	}
	public void selectOne() {// 테이블 데이터 하나만 조회 : select $ from member where id = 11;
		int idx = 7;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select * from member where id = ?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, idx);
			rs = pstmt.executeQuery(); //사전에 쿼리를 가지고있기 때문에 실행메소스에는 쿼리 x
			while(rs.next()) {
//				System.out.println(rs.getInt("id") + "\t" + rs.getString("name"));
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2));
			}
			
		}catch(SQLException e) {
			System.out.println("selectOne() ERR"+e.getMessage());
		}finally {
			try {
					rs.close();
					pstmt.close();
			}catch(SQLException e1) {
				System.out.println("Close ERR"+e1.getMessage());
//				rs.close();
//				pstmt.close();
			}
		}
	
	}
	public void insert() {// 테이블 데이터 삽입(추가) select * 
		int idx = 14;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
	
		String query = "insert into member values (? , ?)";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, idx);
			pstmt.setString(2, "sss");
			rs = pstmt.executeQuery(); //사전에 쿼리를 가지고있기 때문에 실행메소스에는 쿼리 x
			int n = pstmt.executeUpdate(); 
//			if(n>0){
//				System.out.print("Success");
//			}

//			while(rs.next()) {
//				System.out.println(rs.getInt(1) + "\t" + rs.getString(2));
////				System.out.println(rs.getInt(1) + "\t" + rs.getString(2));
//			}
//			
		}catch(SQLException e) {
			System.out.println("insert into member ERR"+e.getMessage());
		}finally {
			try {
//					rs.close();
					pstmt.close();
			}catch(SQLException e1) {
				System.out.println("Close ERR"+e1.getMessage());
//				rs.close();
//				pstmt.close();
			}
		}
	
	}
	public void update() {// 테이블 데이터 수정 
		int id = 10;
		int id2 = 15;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
	
		String query = "update member set id = ? , id = ?  where name = ?";//update TableName set 바꿀항목 ,찾은항목,조건 
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, id);//어떤값을 바꾸고 싶은건지 
			pstmt.setInt(2, id2);//어떤값으로 바꿀건지 
			pstmt.setString(3, "sss");
//			rs = pstmt.executeQuery(); //사전에 쿼리를 가지고있기 때문에 실행메소스에는 쿼리 x
			int n = pstmt.executeUpdate(); 
			if(n>0){
				System.out.print("Success");
			}

//			while(rs.next()) {
//				System.out.println(rs.getInt(1) + "\t" + rs.getString(2));
////				System.out.println(rs.getInt(1) + "\t" + rs.getString(2));
//			}
//			
		}catch(SQLException e) {
			System.out.println("update ERR"+e.getMessage());
		}finally {
			try {
//					rs.close();
					pstmt.close();
			}catch(SQLException e1) {
				System.out.println("Close ERR"+e1.getMessage());
//				rs.close();
//				pstmt.close();
			}
		}
	
	}
	public void delete() {// 테이블 데이 삭제 
		int idx = 14;

		PreparedStatement pstmt = null;
		ResultSet rs = null;
	
		String query = "delete from member where id = ? ";//update TableName set 바꿀항목 ,찾은항목,조건 
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, idx);
//			rs = pstmt.executeQuery(); //사전에 쿼리를 가지고있기 때문에 실행메소스에는 쿼리 x
			int n = pstmt.executeUpdate(); 
	
//			while(rs.next()) {
//				System.out.println(rs.getInt(1) + "\t" + rs.getString(2));
////				System.out.println(rs.getInt(1) + "\t" + rs.getString(2));
//			}
//			
		}catch(SQLException e) {
			System.out.println("delete from ERR"+e.getMessage());
		}finally {
			try {
//					rs.close();
					pstmt.close();
			}catch(SQLException e1) {
				System.out.println("Close ERR"+e1.getMessage());
//				rs.close();
//				pstmt.close();
			}
		}
	
	}

	
	public void connectMySQL() {
		//1.driver 로드 : Class.forName("드라이버 명")
		//2.MySQL과 접속 : DriverManager.getConnection("접속주", "아이디","비밀번호");
		//외부와 통신하기 떄문에 예외;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, id_mysql, pw_mysql);
			System.out.println("Success");
		}catch(ClassNotFoundException e) {
			System.out.println("Class.forName(Driver)"+e.getMessage());
		}catch(SQLException e) {
			System.out.println("getConnection()"+e.getMessage());
		}
	}
	

}
