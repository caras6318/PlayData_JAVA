package com.freeflux.bootcamp.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.freeflux.bootcamp.dto.BootCampStudent;

//cName varchar(10) not null,    
//cRating char(4) not null,
//cJoinDate char(11),
//cLastDate char(11),
//cVisitNo int(1), 
//cPostNo int(1),
//cCommentNo int(1),
//cGender varchar(4) not null,
//cAge varchar(20) not null,

public abstract class Querys {
	final String querySelectAll = "select * from bootcamp2";
	final String querySelectGender = "select cSeqNo, cName, cGender from bootcamp2 where cGender=?";
	final String queryUpdate = "update bootcamp2 set cGender=? where cSeqNo=?";
	final String queryInsert = "insert into bootcamp2 (cName, cGender, cAge) values (?, ?, ?)";
	final String querySelectAvg = "select cSeqNo, cName, cVisitNo from bootcamp2 where cVisitNo>?";
	final String querySelectAge = "select cSeqNo, cName, cVisitNo from bootcamp2 where cAge=?";

	public Querys() {
	}

	public abstract void selectAll();

	public abstract void insert(BootCampStudent student);
	
	public abstract ArrayList<BootCampStudent> selectGender(String keyword);

	public abstract void update(ArrayList<BootCampStudent> keywordList);

	public abstract ArrayList<BootCampStudent> selectOverAvg(float vAvg);

	public abstract ArrayList<BootCampStudent> selectAgeNone(String keyword);

		
	
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

	public void close(Connection conn) {
		try {
			conn.close();
		} catch (SQLException e) {
			System.out.println("Connection  CLOSE  ERR : " + e.getMessage());
		}
	} // close() END

}
