package com.coforge.dao;

import com.coforge.config.AppConfig;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.coforge.entities.Employee;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class EmployeeDAO implements EmployeeDaoInter {
	
	private final AppConfig appConfig;
	@Autowired
	private JdbcTemplate jdbcTemplate;

	EmployeeDAO(AppConfig appConfig) {
		this.appConfig = appConfig;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Employee Dao bean created, @postConstruct called");
		
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Employee dao bean is being destroyed, @PreDestroy invoked");
		
	}

	@Override
	public  List<Employee> getAllEmployees() {
	
		String query = "select * from emp_tab ";
		RowMapper<Employee> rowMapper = (rs, rowNum) -> {
			Employee e = new Employee();
			
			e.setEmpid(rs.getLong("empid"));
			e.setEname(rs.getString("ename"));
			e.setSalary(rs.getDouble("salary"));
			return e;
			
			
		};
		
		
		 return jdbcTemplate.query(query, rowMapper);
	}

	@Override
	public void insertEmployee(Employee employee) {
		
		// TODO Auto-generated method stub
		String query = "insert into emp_tab (empid,ename,salary) values(?,?,?)";
		jdbcTemplate.update(query, employee.getEmpid(), employee.getEname(), employee.getSalary());
		System.out.println("data inserted");
	}

	@Override
	public Employee getEmployeeById(Long empid) {
		String query = "select * from emp_tab where empid = ?";
		RowMapper<Employee> rowMapper = (rs,rowNum) -> {
			Employee e = new Employee();
			e.setEmpid(rs.getLong("empid"));
			e.setEname(rs.getString("ename"));
			e.setSalary(rs.getDouble("salary"));
			return e;
			
		};
		return jdbcTemplate.queryForObject(query, rowMapper, empid);
	}
	
	@Override
	public Employee updateEmployee(long empid, Employee e) {
		
		String query = "update emp_tab set ename =?, salary=? where empid =?";
		jdbcTemplate.update(query, e.getEname() ,e.getSalary(), empid);
		
		return e;
		
		
		
		

	}
	@Override
	public void deleteEmployee(long empid) {
        String query = "delete from emp_tab where empid = ?";
        jdbcTemplate.update(query, empid);
        System.out.println("Deleted");
	}
	

}
