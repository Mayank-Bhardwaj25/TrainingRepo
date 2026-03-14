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
 * Servlet implementation class DepositServlet
 */
@WebServlet("/DepositServlet")
public class DepositServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public DepositServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int accNo = Integer.parseInt(request.getParameter("accNo"));
		PrintWriter out = response.getWriter();
		
		out.println("<html><body>");
		out.println("<h2>Deposit Amount</h2>");
		out.println("<form action='DepositServlet' method='post'>");
		out.println("<input type = 'hidden' name = 'accNo' value='"+accNo+"'>");
		out.println("<input type = 'text' name = 'amount' > <br><br>");
		out.println("<input type = 'submit' value = 'Deposit'>");
		out.println("</form>");
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletContext context = getServletContext();
		Connection conn = (Connection) context.getAttribute("connection");
		
		
		int accNo = Integer.parseInt(request.getParameter("accNo"));
		double amount = Double.parseDouble(request.getParameter("amount"));
		
		AccountDAO.deposit(conn, accNo, amount);
		
		response.sendRedirect("ViewAccountServlet");
		
	}

}
