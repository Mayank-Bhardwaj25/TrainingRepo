package com.coforge.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.List;

import com.coforge.dao.EmployeeDAO;
import com.coforge.models.Employee;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public EmployeeServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String action = request.getParameter("action");
		PrintWriter out = response.getWriter();
		switch(action) {
		
		case "list":
		List<Employee> empList = EmployeeDAO.getAllEmployee();
		
		
		request.setAttribute("empList", empList);
		RequestDispatcher rd = request.getRequestDispatcher("employee-list.jsp");
		rd.forward(request, response);
		break;
		
		case "new":
			 rd = request.getRequestDispatcher("Employee-form.jsp");
			 rd.forward(request, response);
			 break;
			 
		case "edit":
			
			long eid = Long.parseLong(request.getParameter("eid"));
			Employee emp = EmployeeDAO.getEmployeeById(eid);
			request.setAttribute("employee", emp);
			rd = request.getRequestDispatcher("Employee-form.jsp");
			rd.forward(request, response);
			break;
			
		case "delete" :
			long eid1 = Long.parseLong(request.getParameter("eid"));
			EmployeeDAO.deleteEmployee(eid1);
			
			response.sendRedirect("EmployeeServlet?action=list");
			break;
			
		case "info" :
			long eid2 = Long.parseLong(request.getParameter("eid"));
			Employee emp2 = EmployeeDAO.getEmployeeById(eid2);
			request.setAttribute("employee", emp2);
			request.setAttribute("readonly", true);
			 rd = request.getRequestDispatcher("employee-info.jsp");
			rd.forward(request, response);
			break;
		case "search":
			String search= request.getParameter("search");
			List<Employee> empListSearch = EmployeeDAO.getEmployeeByQuery(search);
			request.setAttribute("empList", empListSearch);
			rd = request.getRequestDispatcher("employee-list.jsp");
			rd.forward(request, response);
			break;
		default: out.println("no action selected");
	}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	String eid = request.getParameter("eid");
		String ename = request.getParameter("ename");
		double salary = Double.parseDouble(request.getParameter("salary"));
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		LocalDate doj =LocalDate.parse(request.getParameter("doj"));
		LocalDate dob =LocalDate.parse( request.getParameter("dob"));

		if(eid == null |eid.isEmpty()) {
			Employee e = new Employee(ename, salary, email, mobile, doj, dob);
			EmployeeDAO.addEmployee(e);
			
		}
		
		else {
			long empid = Long.parseLong(eid);
			Employee emp = new Employee();
			emp.setEid(empid);
			emp.setEname(ename);
			emp.setSalary(salary);
			emp.setEmail(email);
			emp.setMobile(mobile);
			emp.setDoj(doj);
			emp.setDob(dob);
			EmployeeDAO.updateEmployee(emp);
		}
		response.sendRedirect("EmployeeServlet?action=list");
	}
	

		
	

}
