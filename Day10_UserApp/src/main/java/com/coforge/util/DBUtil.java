package com.coforge.util;


import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {


		public static Connection getConnection() {
			
			Connection con = null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
		        
		        System.out.println("Driver loaded");
		        
		        String uname = "root";
		        String password = "Cfg@1234";
		        
		        String url = "jdbc:mysql://localhost:3306/cfgdb";
		        
		       con = DriverManager.getConnection(url, uname, password);
		        
		        System.out.println("Connection Established");
			} catch (Exception e) {
				e.printStackTrace();
			}
			return con;
			
		}

	}


