package com.coforge.Day8_jdbc_procedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        
        Class.forName("com.mysql.cj.jdbc.Driver" );
        
        System.out.println("Driver loaded");
        
        String uname = "root";
        String password = "Cfg@1234";
        
        String url = "jdbc:mysql://localhost:3306/cfgdb";
        
        Connection conn = DriverManager.getConnection(url, uname, password);
        
        System.out.println("Connection Established");
        
        String query = "{call get_all_students()}";
        
        CallableStatement cs = conn.prepareCall(query);
        ResultSet rs = cs.executeQuery();
        System.out.println("Student data");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
        int count = rsmd.getColumnCount();
        for(int i = 1; i<=count; i++) {
        	System.out.println(rsmd.getCatalogName(i) + " " + rsmd.getColumnType(i));
        	
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        while(rs.next()) {
        	
        	System.out.println("stdid : " +rs.getInt("stdid"));
       	System.out.println("stdname : " +rs.getString("stdname"));
       	System.out.println("Marks : "+ rs.getDouble("marks"));
       	System.out.println("Mobile number : "+rs.getString("mobile_num"));
       	System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
       	
       }
        
        
    }
}
