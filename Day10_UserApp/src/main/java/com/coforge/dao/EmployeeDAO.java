package com.coforge.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.coforge.models.Employee;
import com.coforge.util.DBUtil;

public class EmployeeDAO {

	
	public static List<Employee> getAllEmployee() {
		Connection conn = null;
		String query = "select * from employes ";
		try {
			conn = DBUtil.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			List<Employee> empList = new ArrayList<>();
			while(rs.next()) {
				Employee e = new Employee();
				e.setEid(rs.getLong("eid"));
				e.setEname(rs.getString("ename"));
				e.setSalary(rs.getLong("salary"));
				e.setEmail(rs.getString("email"));
				e.setMobile(rs.getString("mobile"));
				e.setDoj(rs.getDate("doj").toLocalDate());
				e.setDob(rs.getDate("dob").toLocalDate());
				empList.add(e);
				
			}
			return empList;
			
		}catch(Exception e) {
			e.printStackTrace();
			e.getMessage();
			
			
		}
		return null;
		
	}
	
	public  static void addEmployee(Employee employee) {
		
		String query = "insert into employes (ename, salary, email, mobile, doj, dob) values (?,?,?,?,?, ?)";
		try (
			Connection conn = DBUtil.getConnection();
			PreparedStatement ps = conn.prepareStatement(query) ){
				//ps.setLong(1, employee.getEid());
				System.out.println("Conn "+conn);
				ps.setString(1, employee.getEname());
				ps.setDouble(2, employee.getSalary());
				ps.setString(3, employee.getEmail());
				ps.setString(4, employee.getMobile());
				ps.setDate(5,java.sql.Date.valueOf(employee.getDoj()));
				ps.setDate(6,java.sql.Date.valueOf(employee.getDob()));
				ps.executeUpdate();
				System.out.println("row inserted");
				
			}catch(Exception e) {
				e.printStackTrace();	
			}
		
		
		} 
	
	public static void updateEmployee(Employee emp) {
		
		String query = "update employes set ename =?, salary=?, email=?,mobile=?, doj=?, dob=? where eid =?";
		
		try(
				Connection conn = DBUtil.getConnection();
				PreparedStatement ps = conn.prepareStatement(query);
				)
		{
			ps.setString(1,emp.getEname());
			ps.setDouble(2, emp.getSalary());
			ps.setString(3, emp.getEmail());
			ps.setString(4, emp.getMobile());
			ps.setDate(5, java.sql.Date.valueOf(emp.getDoj()));
			ps.setDate(6, java.sql.Date.valueOf(emp.getDob()));
			ps.setLong(7,emp.getEid());
			ps.executeUpdate();
			System.out.println("Employee updated successfully ");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static Employee getEmployeeById(long eid)  {
		Employee emp = null;
		String query = "select * from employes where eid =?";
		try(
				Connection conn = DBUtil.getConnection();
				PreparedStatement ps = conn.prepareStatement(query))
		{
			ps.setLong(1, eid);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				emp = new Employee();
				emp.setEid(rs.getLong("eid"));
				emp.setEname(rs.getString("ename"));
				emp.setSalary(rs.getDouble("salary"));
				emp.setEmail(rs.getString("email"));
				emp.setMobile(rs.getString("mobile"));
				emp.setDoj(rs.getDate("doj").toLocalDate());
				emp.setDob(rs.getDate("dob").toLocalDate());
				
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return emp;
	}
	
	public static void deleteEmployee(long eid) {
		String query = "delete from employes where eid = ?";
		
		try(
		  Connection conn = DBUtil.getConnection();
		 PreparedStatement ps = conn.prepareStatement(query);
		) {
			ps.setLong(1,eid);
			ps.executeUpdate();
			System.out.println("emeployee dleted successfully");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static List<Employee> getEmployeeByQuery(String search) {
		
			String query = "Select * from employes where ename like ? or email like ? or mobile like ? or doj like ? or dob like ?";
			try(Connection con=DBUtil.getConnection();
					PreparedStatement ps = con.prepareStatement(query);){
				search = '%' + search + '%';
				ps.setString(1, search);
				ps.setString(2, search);
				ps.setString(3, search);
				ps.setString(4, search);
				ps.setString(5, search);
				ResultSet rs = ps.executeQuery();
				
				ArrayList<Employee> empList = new ArrayList<Employee>();
				while(rs.next()) {
					Employee employee = new Employee();
					employee.setEid(rs.getInt("eid"));
					employee.setEname(rs.getString("ename"));
					employee.setSalary(rs.getLong("salary"));
					employee.setEmail(rs.getString("email"));
					employee.setMobile(rs.getString("mobile"));
					employee.setDoj(rs.getDate("doj").toLocalDate());
					employee.setDob(rs.getDate("dob").toLocalDate());
					
					empList.add(employee);
				}
				return empList;
				
			} catch ( Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		}
	
	
	
}
