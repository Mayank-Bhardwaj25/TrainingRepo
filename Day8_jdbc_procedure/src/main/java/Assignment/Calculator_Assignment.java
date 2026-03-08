package Assignment;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class Calculator_Assignment {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		  
        Class.forName("com.mysql.cj.jdbc.Driver" );
        
        System.out.println("Driver loaded");
        
        String uname = "root";
        String password = "Cfg@1234";
        
        String url = "jdbc:mysql://localhost:3306/cfgdb";
        
        Connection conn = DriverManager.getConnection(url, uname, password);
        
        System.out.println("Connection Established");
        
     String query1 = "{call add_numbers(?,?,?)}";
        
        CallableStatement cs = conn.prepareCall(query1);
//        ResultSet rs = cs.executeQuery();
        
        
        
        cs.setInt(1, 34);
        cs.setInt(2, 67);
        cs.registerOutParameter(3, Types.INTEGER);
        
        
        cs.execute();
        int sum = cs.getInt(3);
        System.out.println("Addition of two numbers :- "+sum);
        
        
        
        //SUBSTRACTION
        
       String query2  = "{call sub_two__numbers(?,?,?)}";
        
         cs = conn.prepareCall(query2);
//        ResultSet rs = cs.executeQuery();
        
        
        
        cs.setInt(1, 39);
        cs.setInt(2, 20);
        cs.registerOutParameter(3, Types.INTEGER);
        
        
        cs.execute();
        int diff = cs.getInt(3);
        System.out.println("Difference of two numbers :- "+diff);
        
        //Multiplication
        
        String query3 = "{call mul_two__numbers(?,?,?)}";
        
        cs = conn.prepareCall(query3);
//       ResultSet rs = cs.executeQuery();
       
       
       
       cs.setInt(1, 10);
       cs.setInt(2, 20);
       cs.registerOutParameter(3, Types.INTEGER);
       
       
       cs.execute();
       int mul = cs.getInt(3);
       System.out.println("Multiplication of two numbers :- "+mul);
       
       
       //Division
       
       
       String query4 = "{call div_two__numbers(?,?,?)}";
       
       cs = conn.prepareCall(query4);
//      ResultSet rs = cs.executeQuery();
      
      
      
      cs.setInt(1, 6);
      cs.setInt(2, 12);
      cs.registerOutParameter(3, Types.INTEGER);
      
      
      cs.execute();
      int div = cs.getInt(3);
      System.out.println("Division of two numbers :- "+div);
        
        
        

}
}
