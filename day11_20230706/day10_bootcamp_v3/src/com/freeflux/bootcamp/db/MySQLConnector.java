package com.freeflux.bootcamp.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.freeflux.bootcamp.dto.BootCampStudent;

public class MySQLConnector extends Querys{
	private String dbName="";
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/";
	private String params = "?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
	private String id_mysql = "root";
	private String pw_mysql = "1234"; // 본인 비밀번호

	public Connection conn = null;
	
	public static ArrayList<BootCampStudent> studentList = null;

	public MySQLConnector() { // 기본 생성자
	}
	
	/** 데이터베이스명을 전달받는 생성자 **/
	public MySQLConnector(String dbName) { 
		this.dbName=dbName;
		this.url = this.url + this.dbName + this.params;
	}
	
	/** MySQL Connect Method **/
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

	} //  connectMySQL() END

	
	
	/** 전체 레코드 조회 **/
	@Override
	public void selectAll() {
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(querySelectAll);

			studentList = new ArrayList<BootCampStudent>();
			
			while (rs.next()) {
				int cSeqNo = rs.getInt("cSeqNo");
				String cName = rs.getString("cName");
				String cRating = rs.getString("cRating");
				String cJoinDate = rs.getString("cJoinDate");
				String cLastDate = rs.getString("cLastDate");
				int cVisitNO = rs.getInt("cVisitNO");
				int cPostNo = rs.getInt("cPostNo");
				int cCommentNo = rs.getInt("cCommentNo");
				String cGender = rs.getString("cGender");
				String cAge = rs.getString("cAge");
				
				studentList.add(new BootCampStudent(cSeqNo, cName, cRating, cJoinDate, cLastDate, cVisitNO, cPostNo, cCommentNo, cGender, cAge));
			}

		} catch (SQLException e) {
			System.out.println("selectAll()  ERR : " + e.getMessage());
		} finally {
			this.close(stmt, rs);
		}
		
		System.out.println("현재 수강생 명단 조회 성공 !!!");
	} // selectAll() END

	
	
	
	/** 성별이 기타인 사람 조회 **/
	@Override
	public ArrayList<BootCampStudent> selectGender(String keyword) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<BootCampStudent> keywordList = null;
		
		try {
			pstmt = conn.prepareStatement(querySelectGender);
			pstmt.setString(1, keyword);
			rs = pstmt.executeQuery();

			keywordList = new ArrayList<BootCampStudent>();
			
			while (rs.next()) {
				int cSeqNo = rs.getInt("cSeqNo");
				String cName = rs.getString("cName");
				String cGender = rs.getString("cGender");
				
				keywordList.add(new BootCampStudent(cSeqNo, cName, cGender));
			}
			
			System.out.println("성별이 \'기타\'인 수강생 명단 조회 성공 !!!");

		} catch (SQLException e) {
			System.out.println("selectGender()  ERR : " + e.getMessage());
		} finally {
			this.close(pstmt, rs);
		}
		
		return keywordList;
	} // selectGender() END
	
	
	/** 성별이 기타인 사람 성별 수정 **/
	@Override
	public void update(ArrayList<BootCampStudent> changedList) {
		PreparedStatement pstmt = null;
		int n = 0;
		
		try {
			pstmt = conn.prepareStatement(queryUpdate);
			
			for(BootCampStudent student : changedList) {
				pstmt.setString(1, student.getcGender());
				pstmt.setInt(2, student.getcSeqNo());
				n = n + pstmt.executeUpdate();
			}
			
			System.out.println("성별이 \'기타\'인 수강생 " + n + "명 수정 성공 !!!");

		} catch (SQLException e) {
			System.out.println("selectGender()  ERR : " + e.getMessage());
		} finally {
			this.close(pstmt);
		}
	} // update() END
	
	
	
	
	/** 멤버 추가 **/
	@Override
	public void insert(BootCampStudent student) {
		PreparedStatement pstmt = null;

		// "insert into bootcamp2 (cName, cGender, cAge) values (?, ?, ?)";
		int n = 0;
		
		try {
			pstmt = conn.prepareStatement(queryInsert);
			pstmt.setString(1,  student.getcName());
			pstmt.setString(2,  student.getcGender());
			pstmt.setString(3,  student.getcAge());
			n = pstmt.executeUpdate();
			
			if(n > 0) {
				System.out.println(n + " 개의 RECORD insert Success!!!");
			}
			
		} catch (SQLException e) {
			System.out.println("insert()  ERR : " + e.getMessage());
		} finally {
			this.close(pstmt);
		}
		
	} // insert() END

	
	
	
	/** 평균 방문횟수 보다 많이 방문한 사람 명단 **/
	@Override
	public ArrayList<BootCampStudent> selectOverAvg(float vAvg) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<BootCampStudent> visitList = null;
		
		try {
			visitList = new ArrayList<BootCampStudent>();
			
			pstmt = conn.prepareStatement(querySelectAvg);
			pstmt.setFloat(1, vAvg);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int cSeqNo=rs.getInt("cSeqNo");
				String cName=rs.getString("cName");
				int cVisitNO=rs.getInt("cVisitNO");
				
				visitList.add(new BootCampStudent(cSeqNo, cName, cVisitNO));
			}
			
			System.out.println("평균 방문횟수 보다 많이 방문한 사람이름 조회 성공 !!!");

		} catch (SQLException e) {
			System.out.println("selectGender()  ERR : " + e.getMessage());
		} finally {
			this.close(pstmt, rs);
		}
		
		return visitList;
	} // selectAvg() END

	
	
	
	/** 나이 비공개인 사람들의 방문 횟수 **/
	@Override
	public ArrayList<BootCampStudent> selectAgeNone(String keyword) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<BootCampStudent> keywordList = null;
		
		try {
			pstmt = conn.prepareStatement(querySelectAge);
			pstmt.setString(1, keyword);
			rs = pstmt.executeQuery();

			keywordList = new ArrayList<BootCampStudent>();
			
			while (rs.next()) {
				int cSeqNo=rs.getInt("cSeqNo");
				String cName=rs.getString("cName");
				int cVisitNO=rs.getInt("cVisitNO");
				
				keywordList.add(new BootCampStudent(cSeqNo, cName, cVisitNO));
			}
			
			System.out.println("나이 비공개인 사람들 조회 성공 !!!");

		} catch (SQLException e) {
			System.out.println("selectAge()  ERR : " + e.getMessage());
		} finally {
			this.close(pstmt, rs);
		}
		
		return keywordList;

	} // selectAge() END

	

	
	

}
