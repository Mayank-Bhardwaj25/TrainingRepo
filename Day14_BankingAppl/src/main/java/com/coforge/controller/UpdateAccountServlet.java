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

import com.coforge.dao.AccountDAO;

import jakarta.servlet.ServletContext;

/**
 * Servlet implementation class UpdateAccountServlet
 */
@WebServlet("/UpdateAccountServlet")
public class UpdateAccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public UpdateAccountServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext context = getServletContext();
		Connection conn = (Connection) context.getAttribute("connection");
		
		int accNo = Integer.parseInt(request.getParameter("accNo"));
		String accHolderName = request.getParameter("accHolderName");
		String accType = request.getParameter("accType");
		double balance = Double.parseDouble(request.getParameter("balance"));
		
		AccountDAO.updateAccount(conn, accNo, accHolderName, accType, balance);
		response.sendRedirect("ViewAccountServlet");
	}

}
