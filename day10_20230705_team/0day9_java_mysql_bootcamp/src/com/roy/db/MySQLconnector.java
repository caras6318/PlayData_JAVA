package com.roy.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.roy.dto.BootCamp;

public class MySQLconnector {
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/db_bootcamp?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
	private String id_mysql = "root";
	private String pw_mysql = "Gkgk6318gkgk!"; // 본인 비밀번호

	public Connection conn = null;

	public MySQLconnector() { 
	}
	
	public void connectMySQL() {
	
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, id_mysql, pw_mysql);
			System.out.println(" MySQL 접속 성공 !!!");
			
		} catch (ClassNotFoundException e) {
			System.out.println("Class.forName(driver) ERR : " + e.getMessage());
		}catch (SQLException e) {
			System.out.println("getConnection() ERR : " + e.getMessage());
		}

	}

//	/** 테이블 데이터 전체 조회 **/
//	public ArrayList<BootCamp> selectAll() {
//		Statement stmt = null;
//		ResultSet rs = null;
//		ArrayList<BootCamp> student = null;
//		try {
//			stmt = conn.createStatement();
//			rs = stmt.executeQuery(Querys.querySelectAll);
//
//			student = new ArrayList<BootCamp>();
//			while (rs.next()) {
//		
//				String cName 		= rs.getString("cName");
//				String cRating 		= rs.getString("cRating");
//				String cJoinDate 	= rs.getString("cJoinDate");
//				String cLastDate 	= rs.getString("cLastDate");
//				int cVisitNo 		= rs.getInt("cVisitNo");
//				int cPostNo 		= rs.getInt("cPostNo");
//				int cCommentNo 		= rs.getInt("cCommentNo");
//				String cGenger 		= rs.getString("cGenger");
//				String cAge 		= rs.getString("cAge");
//				
//				student.add(new BootCamp(cName, cRating, cJoinDate, cLastDate, cVisitNo, cPostNo, cCommentNo , cGenger, cAge));
//			}
//
//		} catch (SQLException e) {
//			System.out.println("selectAll()  ERR : " + e.getMessage());
//		} finally {
//			this.close(stmt, rs);
//		}
//		
//		return student;
//	} // selectAll() END
//
//	/** 테이블 데이터 하나만 조회 **/
//	public void selectOne() {
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//
//		try {
//			pstmt = conn.prepareStatement(Querys.querySelectOne);
//			rs = pstmt.executeQuery();
//			
//			
//			while (rs.next()) {
//				
//			}
//
//		} catch (SQLException e) {
//			System.out.println("selectOne()  ERR : " + e.getMessage());
//		} finally {
//			this.close(pstmt, rs);
//		}
	} // selectOne() END
//
//	/** 테이블에 데이터 삽입(추가) **/
//	public void insert() {
//		PreparedStatement pstmt = null;
//		int n = 0;
//
////		Scanner scan = new Scanner(System.in);
//		
//		BootCamp emp = new BootCamp(1001, "손석구", "과장", "05", "2023-07-01", 300, 0, 20);
//		try {
//			pstmt = conn.prepareStatement(Querys.queryInsert);
//			pstmt.setInt(1,  emp.getEmpNo());
//			pstmt.setString(2,  emp.getEmpName());
//			pstmt.setString(3,  emp.getJob());
//			pstmt.setString(4,  emp.getMgr());
//			pstmt.setString(5,  emp.getHireDate());
//			pstmt.setInt(6,  emp.getSale());
//			pstmt.setInt(7,  emp.getDeptNo());
//			n = pstmt.executeUpdate();
//			
//			if(n > 0) {
//				System.out.println(n + " 개의 RECORD insert Success!!!");
//			}
//			
//		} catch (SQLException e) {
//			System.out.println("insert()  ERR : " + e.getMessage());
//		} finally {
//			this.close(pstmt);
//		}
//	} // insert() END
//
//
//	
	/** 테이블 데이터 수정 **/
	public ArrayList<BootCamp> update(ArrayList<BootCamp> bootList) {
		PreparedStatement pstmt = null;
		int n = 0;

		try {
			// 체크 요망!!!
			pstmt = conn.prepareStatement(Querys.queryUpdate);
			for(int idx = 0; idx<bttoList.size(); idx++) {
				if(bootList.get(idx).getcName() == "허찬") {
			
					pstmt.setString(1,"남자" );
					pstmt.setInt(2, idx+1);
					n = pstmt.executeUpdate();
				}else {
					System.out.print("pass");
				}
			}
			
			if(n > 0) {
				System.out.println(n + " 개의 RECORD update Success!!!");
			}
			
		} catch (SQLException e) {
			System.out.println("update()  ERR : " + e.getMessage());
		} finally {
			this.close(pstmt);
		}
		
		return empList;
	} // update() END
	
	/** 자원 해제 메서드들 : Overloading 기법 **/
	public void close(Statement stmt, ResultSet rs) {
		try {
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			System.out.println("Statement, ResultSet CLOSE  ERR : " + e.getMessage());
		}
	} // close() END

	public void close(PreparedStatement pstmt, ResultSet rs) {
		try {
			rs.close();
			pstmt.close();
		} catch (SQLException e) {
			System.out.println("PreparedStatement, ResultSet  CLOSE  ERR : " + e.getMessage());
		}
	} // close() END

	public void close(PreparedStatement pstmt) {
		try {
			pstmt.close();
		} catch (SQLException e) {
			System.out.println("PreparedStatement  CLOSE  ERR : " + e.getMessage());
		}
	} // close() END

	public void close() {
		try {
			conn.close();
		} catch (SQLException e) {
			System.out.println("Connection  CLOSE  ERR : " + e.getMessage());
		}
	} // close() END

}
