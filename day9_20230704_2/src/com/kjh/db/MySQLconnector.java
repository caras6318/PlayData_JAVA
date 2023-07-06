package com.kjh.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.kjh.NewEMP;

public class MySQLconnector {

	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/db_emp?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
	private String id_mysql = "root";
	private String pw_mysql = "Gkgk6318gkgk!";
	
	public Connection con = null;
	
	public MySQLconnector() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void selectEmp() {
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from employee");
			while(rs.next()) {
				System.out.println(rs.getString("empName"));
			}
			System.out.println("\n");
			rs.close();
			stmt.close();
		}catch(SQLException e) {
			System.out.println("Select ERR"+e.getMessage());
		}finally {
			
		try{
			rs.close();
			stmt.close();
		}catch(SQLException e1) {
			System.out.println("Select Close ERR"+e1.getMessage());
		}
	}
	
	}
	public void insertEmp(ArrayList<NewEMP> s) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
	
		String query = "insert into employee (empNo, empName, job, mgr, hireDate, sale, commission, deptNo) values (?,?,?,?,?,?,?,?)";
		try {
			pstmt = con.prepareStatement(query);
//			System.out.print(s.get(0).empName);
			pstmt.setInt(1, s.get(0).empNo);
			pstmt.setString(2, s.get(0).empName);
			pstmt.setString(3, s.get(0).job);
			pstmt.setString(4, s.get(0).mgr);
			pstmt.setString(5, s.get(0).hireDate);
			pstmt.setInt(6, s.get(0).sale);
			pstmt.setInt(7, s.get(0).commission);
			pstmt.setInt(8, s.get(0).deptNo);
			
//			rs = pstmt.executeQuery(); //사전에 쿼리를 가지고있기 때문에 실행메소스에는 쿼리 x
			int n = pstmt.executeUpdate(); 
//			if(n>0){
//				System.out.println("Success");
//			}
		}catch(SQLException e) {
			System.out.println("Insert ERR"+e.getMessage());
		}finally {
			try {
					pstmt.close();
			}catch(SQLException e1) {
				System.out.println("Close ERR"+e1.getMessage());
			}
		}
	
		
	}
	
	
	public void updateEmp() {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int i = 1;
		String query = "update employee set sale = ? ,sale  = ? where empNo = ?";
		try {
			pstmt = con.prepareStatement(query);
		
			
//			System.out.print(s.get(0).empName);
			pstmt.setInt(1,rs.getInt("sale"));
			pstmt.setInt(2,(int)(rs.getInt("sale")*1.1));
			pstmt.setInt(3,i);
//			rs = pstmt.executeQuery(); //사전에 쿼리를 가지고있기 때문에 실행메소스에는 쿼리 x
			int n = pstmt.executeUpdate(); 
//			if(n>0){
//				System.out.println("Success");
//			}
		}catch(SQLException e) {
			System.out.println("Insert ERR"+e.getMessage());
		}finally {
			try {
					pstmt.close();
			}catch(SQLException e1) {
				System.out.println("Close ERR"+e1.getMessage());
			}
		}
	
		
		}
	public void deleteEmp() {
	
	}
	
	public void connectMySQL() {
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, id_mysql, pw_mysql);
		}catch(ClassNotFoundException e) {
			System.out.println("Class.forName(Driver)"+e.getMessage());
		}catch(SQLException e) {
			System.out.println("getConnection()"+e.getMessage());
		}
	}
}
