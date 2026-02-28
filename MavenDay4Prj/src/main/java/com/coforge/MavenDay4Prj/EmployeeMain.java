package com.coforge.MavenDay4Prj;

import java.util.function.Consumer;

public class EmployeeMain {

	public static void main(String[] args) {
		
		
		Employee e1 = new Employee("Mayank", 123, 80000);
		Employee e2 = new Employee("Gaurav", 456, 57800);
		Employee e3  = new Employee("Rajat", 789, 90000);
		Employee e4 = new Employee("Nitish", 567, 60000);
		Employee e5 = new Employee("Ayush", 777, 50000);
		
		Employee empArr[] = {e1, e2, e3, e4, e5};
		for(Employee emp : empArr) {
			System.out.println(emp);
		}
		
		Consumer<Employee[]> empConsumer = (empArr1) -> {
			double max = empArr1[0].getSalary();
			for(Employee emp : empArr) {
				System.out.println(emp.getEname());
			if(emp.getSalary() >max)
				max = emp.getSalary();
			
			}
			System.out.println(max);
			
		};
   empConsumer.accept(empArr);
		
	}
}
