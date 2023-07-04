package com.kjh;

import com.kjh.db.MySQLconnector;

public class Main {

	public static void main(String[] args) {
		MySQLconnector mysql = new MySQLconnector();
		mysql.connectMySQL();
		mysql.selectALL();
//		mysql.selectOne();
		mysql.insert();
//		mysql.update();
//		mysql.delete();
	}

}
