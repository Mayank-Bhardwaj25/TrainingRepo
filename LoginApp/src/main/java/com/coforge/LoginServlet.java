package com.coforge;

import java.io.IOException;

import java.io.PrintWriter;
import java.security.DomainCombiner;

import javax.swing.plaf.metal.MetalBorders.Flush3DBorder;

import Assignment_Signup.User;
import Assignment_Signup.UserDB;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import Assignment_Signup.User;
import Assignment_Signup.UserDB;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//PrintWriter out = response.getWriter();
		String uname = request.getParameter("uname");
		String pwd = request.getParameter("pwd");
		RequestDispatcher rd = null;
		
//		if(uname.equals("Mayank") && pwd.equals("Mayank456")) {
//			//out.println("Welcome " +uname);
//			request.setAttribute("uname", uname);
//			rd = request.getRequestDispatcher("/Welcome.jsp");
//			rd.forward(request, response);
//		}
//		      
//			
//		else {
//			//out.println(" <html> <body><h3> Invalid credentials </h3></body> </html> ");
//			rd = request.getRequestDispatcher("/error.jsp");
//			rd.forward(request, response);
//			
//		}
//			 
		User loggedInUser = null;
		
		for(User u : UserDB.userSet) {
			if(u.getUsername().equals(uname) && u.getPassword().equals(pwd)) {
				loggedInUser = u;
				break;
			}
		}
		
		if(loggedInUser != null) {
			request.setAttribute("user", loggedInUser);
			
			rd = request.getRequestDispatcher("/Welcome.jsp");
		}
		else {
			rd = request.getRequestDispatcher("/Error.jsp");
		}
		rd.forward(request, response);
		
	System.out.println(UserDB.userSet);
		
		
//		out.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
