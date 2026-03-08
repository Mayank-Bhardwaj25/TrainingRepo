package com.coforge.Day8_jdbc_procedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class Calculator {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		  
        Class.forName("com.mysql.cj.jdbc.Driver" );
        
        System.out.println("Driver loaded");
        
        String uname = "root";
        String password = "Cfg@1234";
        
        String url = "jdbc:mysql://localhost:3306/cfgdb";
        
        Connection conn = DriverManager.getConnection(url, uname, password);
        
        System.out.println("Connection Established");
        
        String query = "{call add_numbers(?,?,?)}";
        
        CallableStatement cs = conn.prepareCall(query);
//        ResultSet rs = cs.executeQuery();
        
        
        
        cs.setInt(1, 34);
        cs.setInt(2, 67);
        cs.registerOutParameter(3, Types.INTEGER);
        
        
        cs.execute();
        int sum = cs.getInt(3);
        System.out.println("Addition of two numbers :- "+sum);
        
      

	}

}
