package com.coforge.Day7_JDBC_Prj;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

import com.mysql.cj.protocol.Resultset;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        System.out.println("Hello World!");
        
        Class.forName("com.mysql.cj.jdbc.Driver" );
        
        System.out.println("Driver loaded");
        
        String uname = "root";
        String password = "Cfg@1234";
        
        String url = "jdbc:mysql://localhost:3306/cfgdb";
        
        Connection conn = DriverManager.getConnection(url, uname, password);
        
        System.out.println("Connection Established");
        
        //INSERTION CODE
        
//        String query = "insert into student_table values (?, ?, ?, ?, ?)";
//        
          // PreparedStatement ps = conn.prepareStatement(query);
//        ps.setInt(1, 647);
//        ps.setString(2, "Tannmayyy");
//        ps.setDouble(3, 81);
//        ps.setString(4, "639594464");
//        //ps.setDate(5, Date(25-04-12));
//        
//        ps.setDate(5,  Date.valueOf("2025-05-21"));
//        //ps.setString(5, "23-09-22");
//        
//        
//         int rows = ps.executeUpdate();
//         System.out.println("Insertion successful !");
//         
//         System.out.println("No of rows affected :- "+ rows);
        
        //update code
        
//        String query = "update student_table set marks = ? where stdid = ?";
//        PreparedStatement ps = conn.prepareStatement(query);
//        ps.setDouble(1, 95);
//        ps.setInt(2, 666);
//         int rows = ps.executeUpdate();
//         System.out.println("Updation successful");
//         System.out.println("No. of rows affected :- "+rows);
         
         
       //DELETION 
         String query = "delete from student_table where stdid = ?";
         PreparedStatement ps = conn.prepareStatement(query);
         ps.setInt(1, 666);
         ps.executeUpdate();
         System.out.println("Row deleted");
         
         
       //Statement st = conn.createStatement();
     //String query = "select * from student_table";
      //ResultSet rs = st.executeQuery(query);
     //ResultSet rs = ps.executeQuery(query);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        
//        ResultSetMetaData rsmd = rs.getMetaData();
//        
//        int count = rsmd.getColumnCount();
//        
//        for(int i = 1; i<=count; i++) {
//        	
//        	System.out.println(rsmd.getColumnName(i)+ " :- " + rsmd.getColumnTypeName(i));
//        	
//        }
        
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        
//        while(rs.next()) {
//        	
//        	System.out.println("stdid : " +rs.getInt("stdid"));
//        	System.out.println("stdname : " +rs.getString("stdname"));
//        	System.out.println("Marks : "+ rs.getDouble("marks"));
//        	System.out.println("Mobile number : "+rs.getString("mobile_num"));
//        	System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        	
//        }
        
        
        
        
        
    }
}
