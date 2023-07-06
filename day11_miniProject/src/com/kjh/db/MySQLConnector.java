package com.kjh.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.kjh.data.Cocktails;

public class MySQLConnector extends Querys{

	private String dbName="";
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/";
	private String params = "?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
	private String id_mysql = "root";
	private String pw_mysql = "Gkgk6318gkgk!"; // 본인 비밀번호

	public Connection con = null;
	
	public static ArrayList<Cocktails> ckList = null;
	
	public MySQLConnector() {}
	
	/** 데이터베이스명을 전달받는 생성자 **/
	public MySQLConnector(String dbName) { 
		this.dbName=dbName;
		this.url = this.url + this.dbName + this.params;
	}
	
	/** MySQL Connect Method **/
	public void connectMySQL() {
	    
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, id_mysql, pw_mysql);
			System.out.println(" MySQL 접속 성공 !!!");
			
		} catch (ClassNotFoundException e) {
			System.out.println("Class.forName(driver) ERR : " + e.getMessage());
		}catch (SQLException e) {
			System.out.println("getConnection() ERR : " + e.getMessage());
		}

	} //  connectMySQL() END
	
	/** 전체 레코드 조회 **/
	@Override
	public void select() {
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(selectA);
			
			ckList = new ArrayList<Cocktails>() ;
			
			while(rs.next()) {
				int cRN = rs.getInt("cRN");
				String cImgUrl = rs.getString("cImgUrl");
				String cRUrl = rs.getString("cRUrl");
				String cName = rs.getString("cName");
				String cIn = rs.getString("cIn"); 		
				String cMeth = rs.getString("cMeth");		
				String cGar = rs.getString("cGar"); 	
				
				ckList.add(new Cocktails(cRN,  cImgUrl,  cRUrl,  cName,  cIn,  cMeth,  cGar));

			}
		}catch(SQLException e){
			System.out.println("selectAll()  ERR : " + e.getMessage());
		}finally {
			this.close(stmt, rs);
		}
		System.out.println("칵테일 리스트 조회 성공 ");
	}
	@Override
	public void insert(Cocktails ckr) {
		PreparedStatement pstmt = null;

		// insert into ckIBA (cImgUrl, cRUrl, cName, cIn , cMeth, cGar) values (?,?,?,?,?,?)";
		int n = 0;
		
		try {
			pstmt = con.prepareStatement(insertR);
			pstmt.setString(1,  ckr.getcName());
			pstmt.setString(2,  ckr.getcIn());
			pstmt.setString(3,  ckr.getcMeth());
			pstmt.setString(4,  ckr.getcGar());
			n = pstmt.executeUpdate();
			
			if(n > 0) {
				System.out.println(n + " 개의 RECIPES insert Success!!!");
			}
			
		} catch (SQLException e) {
			System.out.println("insert()  ERR : " + e.getMessage());
		} finally {
			this.close(pstmt);
		}
		
	} // insert() END
	

}
