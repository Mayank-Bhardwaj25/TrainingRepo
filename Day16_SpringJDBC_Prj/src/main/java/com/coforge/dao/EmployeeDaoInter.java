package com.coforge.dao;

import java.util.List;

import com.coforge.entities.Employee;

public interface EmployeeDaoInter {
	
	
	 List<Employee> getAllEmployees();
	void insertEmployee(Employee employee);
	Employee getEmployeeById(Long empid);
	
     Employee updateEmployee(long empid, Employee e);
     void deleteEmployee(long empid);
     
}
