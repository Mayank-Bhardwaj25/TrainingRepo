package MenuDriven_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	
	public static Connection getConnection() {
		
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver" );
	        
	        System.out.println("Driver loaded");
	        
	        String uname = "root";
	        String password = "Cfg@1234";
	        
	        String url = "jdbc:mysql://localhost:3306/cfgdb";
	        
	       conn = DriverManager.getConnection(url, uname, password);
	        
	        System.out.println("Connection Established");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
		
	}

}
