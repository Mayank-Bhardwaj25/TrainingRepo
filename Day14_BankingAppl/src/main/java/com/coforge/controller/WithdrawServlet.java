package com.coforge.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import com.coforge.dao.AccountDAO;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WithdrawServlet
 */
@WebServlet("/WithdrawServlet")
public class WithdrawServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public WithdrawServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int accNo = Integer.parseInt(request.getParameter("accNo"));
		PrintWriter out = response.getWriter();
		
		out.println("<html><body>");
		out.println("<h2>Withdraw Amount</h2>");
		out.println("<form action='WithdrawServlet' method='post'>");
		out.println("<input type = 'hidden' name = 'accNo' value='"+accNo+"'>");
		out.println("Amount : <input type = 'text' name = 'amount' > <br><br>");
		out.println("<input type = 'submit' value = 'Withdraw'>");
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
		
		AccountDAO.withdraw(conn, accNo, amount);
		response.sendRedirect("ViewAccountServlet");
	}

}
