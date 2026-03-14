package com.coforge.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.IOException;
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
 * Servlet implementation class EditAccountServlet
 */
@WebServlet("/EditAccountServlet")
public class EditAccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public EditAccountServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int accNo = Integer.parseInt(request.getParameter("accNo"));
		
		ServletContext context = getServletContext();
		Connection conn = (Connection) context.getAttribute("connection");
		
		Account acc = AccountDAO.getAccountById(conn, accNo);
		
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<link href = 'https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css ' rel = 'stylesheet' >");
		out.println("</head>");
		out.println("<body class = 'container mt-5'>");
		out.println("<h2 class = 'text-center mb-4'> Edit Account </h2>");
		out.println("<form action = 'UpdateAccountServlet' method = 'post' class = 'w-50 mx-auto'");
		out.println("<div class ='mb-3'>");
		out.println("<label class = 'form-label'> Account Number</label>");
		out.println("<input type = 'text' name = 'accNo' value = '"+acc.getAccNo()+"' class = 'form-control' required");
		out.println("</div>");
		
		out.println("<div class ='mb-3'>");
		out.println("<label class = 'form-label'> Account Holder Name</label>");
		out.println("<input type = 'text' name = 'accHolderName'   value = '"+acc.getAccHolderName()+"'class = 'form-control' required");
		out.println("</div>");
		
		out.println("<div class ='mb-3'>");
		out.println("<label class = 'form-label'> Account Type</label>");
		out.println("<input type = 'text' name = 'accType' value = '"+acc.getAccType()+"' class = 'form-control' required");
		out.println("</div>");
		
		out.println("<div class ='mb-3'>");
		out.println("<label class = 'form-label'> Balance</label>");
		out.println("<input type = 'text' name = 'balance'  value = '"+acc.getBalance()+"'class = 'form-control' required");
		out.println("</div>");
		
		out.println("<button type = 'submit' class = 'btn btn-primary w-100'> Update Account</button>");
		out.println("</form>");
		out.println("</body");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		
	}

}
