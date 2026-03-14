package com.coforge.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.coforge.dao.AccountDAO;
//import com.coforge.dao.BankDAO;
import com.coforge.models.Account;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ViewAccountServlet
 */
@WebServlet("/ViewAccountServlet")
public class ViewAccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ViewAccountServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletContext context = getServletContext();
		Connection conn = (Connection) context.getAttribute("connection");	
		
		 try {
			 List<Account> accList = new ArrayList<>();
			 System.out.println("conn "+conn);
			 
			 String keyword = request.getParameter("keyword");
			  if(keyword !=null && !keyword.isEmpty()) {
				  accList = AccountDAO.searchAccounts(conn, keyword);
				  
			  }
			  else {
			 
			accList = AccountDAO.getAllAccounts(conn);
			  }
			 PrintWriter out = response.getWriter();
			 out.println("<html><body>");
			 out.println("<form action='ViewAccountServlet' method='get'");
			 out.println("<label>Search:</label>");
			 out.println(" <input type = 'text' name = 'keyword'>");
			 out.println("<input type = 'submit' value = 'Search'>");
			 out.println("</form> <br><br>");

			 
			 out.println("<table border = '3px'>");
			 out.println("<head><tr><th> Account Number</th><th>Account HolderName</th>");
			 out.println("<th> Account Type</th><th>Balance</th><th>Actions</th></tr></thead>");
			 out.println("<tbody>");
			 for(Account acc:accList) {
				 out.println("<tr><td>"+acc.getAccNo() + "</td>");
				 out.println("<td>"+acc.getAccHolderName() + "</td>");
				 out.println("<td>"+acc.getAccType() + "</td>");
				 out.println("<td>"+acc.getBalance() + "</td>");
				 out.println("<td>"+ "<a href = 'EditAccountServlet?accNo="+acc.getAccNo()+"'>Edit </a>"+"<a href='DepositServlet?accNo="+acc.getAccNo()+"'>Deposit</a>"+"<a href='WithdrawServlet?accNo="+acc.getAccNo()+"'>Withdraw</a>" +" <a href = 'GetAccountByidServlet?accNo="+acc.getAccNo()+"'>View</a>"+" <a href = 'DeleteAccountServlet?accNo="+acc.getAccNo()+"'>Delete</a></td></tr>");
			 }
			 out.println("</tr></tbody></table></body><html>");
		} catch (Exception e) {
			// TODO Auto-generated catch block
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
