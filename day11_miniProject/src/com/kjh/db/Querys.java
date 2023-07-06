package com.kjh.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.kjh.data.Cocktails;

public abstract class Querys {

	final String step1 = "";		// 첫 선택지 결과 
	final String step2 = "";		// 두번째 선택지 결과 
	final String step3 = "";		// 세번째 선택지 결과 
	final String step4 = "";		// 네번째 선택지 결과
	final String step5 = "";		// 다섯번째 선택지 결과 
	final String selectA = "select * from ckIBA";		// select
	final String insertR = "insert into ckIBA (cName, cIn , cMeth, cGar) values (?,?,?,?)";
	final String delete = "";		// delete
	final String gene = "";			// 최종결과 GenerateHTML에 보내는용
	//DBName = Cocktails TableName = ckIBA 
	
	public Querys() {
	
	}
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

	public void close(Connection con) {
		try {
			con.close();
		} catch (SQLException e) {
			System.out.println("Connection  CLOSE  ERR : " + e.getMessage());
		}
	} // close() END
	/** 전체 레코드 조회 **/
	public abstract void select() ;
	public abstract void insert(Cocktails ckr);

}
