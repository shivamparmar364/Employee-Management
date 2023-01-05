package com.sjprogramming.empapp;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	static Connection con;
	public static Connection createDBConnetion() {
		
		try {
			// load driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/employeeDB";
			String username="root";
			String password="";
			
			con=DriverManager.getConnection(url, username, password);
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		
		//get connection
		return con;
	}
}
