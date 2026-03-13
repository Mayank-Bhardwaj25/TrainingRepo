package com.coforge;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class StudentServlet
 */
//@WebServlet("/StudnetServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
	private String driver;
	private String url;
	private String uname;
	private String pwd;
	
    public StudentServlet() {
        // TODO Auto-generated constructor stub
    }

    public void init(ServletConfig config) throws ServletException {
    	super.init(config);
    	driver = config.getInitParameter("driver");
    	url = config.getInitParameter("url");
    	uname = config.getInitParameter("uname");
    	pwd = config.getInitParameter("pwd");
    	
    	try {
			Class.forName(driver);
    		
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("Student Servlet is running.......");
		
		try(Connection conn = DriverManager.getConnection(url, uname, pwd)) {
			
			String query = "select * from student";
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			while(rs.next() ) {
				out.println("stdId : "+rs.getLong("stdId"));
				out.println("stdName : "+rs.getString("stdName"));
				out.println("Marks : "+rs.getInt("marks"));
				out.println("mobile : "+rs.getString("mobile"));
			}
			
		} catch(Exception e) {
			
			e.printStackTrace();
		}
	}
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
