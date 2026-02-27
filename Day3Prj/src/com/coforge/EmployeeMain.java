package com.coforge;

public class EmployeeMain {
	public static void main(String[] args) {
		
		Employee e1 = new Employee("Mayank", 456, 40000);
		Employee e2 = new Employee("Gaurav", 789, 50000);
		Employee e3 = new Employee("Rajat", 123, 60000);
		Employee.companyName = "Coforge Technology";
		e1.calSalary();
		e2.calSalary();
		e3.calSalary();
		System.out.println(e1);
		
		System.out.println(e2);
		System.out.println(e3);
	}

}
