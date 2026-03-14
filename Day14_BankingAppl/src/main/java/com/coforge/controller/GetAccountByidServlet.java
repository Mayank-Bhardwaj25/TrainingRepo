package com.coforge.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import com.coforge.dao.AccountDAO;
import com.coforge.models.Account;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class GetAccountByidServlet
 */
@WebServlet("/GetAccountByidServlet")
public class GetAccountByidServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public GetAccountByidServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
PrintWriter out = response.getWriter();
ServletContext context = getServletContext();
Connection conn = (Connection) context.getAttribute("connection");
Account ac1 = (Account) context.getAttribute("account");
		
		out.println("<html>");
		out.println("<head>");
		out.println("<link href = 'https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css ' rel = 'stylesheet' >");
		out.println("</head>");
		out.println("<body class = 'container mt-5'>");
		out.println("<h2 class = 'text-center mb-4'> Here are your Account details </h2>");
		out.println("<form  class = 'w-50 mx-auto'");
		out.println("<div class ='mb-3'>");
		out.println("<label class = 'form-label'> Account Number</label>");
		out.println("<input type = 'text' name = 'accNo' value='"+ac1.getAccNo() +"'class = 'form-control' readonly");
		out.println("</div>");
		
		out.println("<div class ='mb-3'>");
		out.println("<label class = 'form-label'> Account Holder Name</label>");
		out.println("<input type = 'text' name = 'accHolderName' value='"+ac1.getAccHolderName() +"' class = 'form-control' readonly");
		out.println("</div>");
		
		out.println("<div class ='mb-3'>");
		out.println("<label class = 'form-label'> Account Type</label>");
		out.println("<input type = 'text' name = 'accType' value='"+ac1.getAccType() +"'class = 'form-control' readonly");
		out.println("</div>");
		
		out.println("<div class ='mb-3'>");
		out.println("<label class = 'form-label'> Balance</label>");
		out.println("<input type = 'text' name = 'balance' value='"+ac1.getBalance() +"' class = 'form-control' readonly");
		out.println("</div>");
		
		
		out.println("</form>");
		out.println("</body");
		out.println("</html>");
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int accNum= Integer.parseInt(request.getParameter("accNum"));
		ServletContext context = getServletContext();
		Connection conn = (Connection) context.getAttribute("connection");
		Account ac = AccountDAO.getAccountById(conn, accNum);
		context.setAttribute("account", ac);
		response.sendRedirect("GetAccountByidServlet");
		
		
	}

}
