package com.coforge.MavenDay6Prj;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import javax.management.modelmbean.InvalidTargetObjectTypeException;

public class Main {
	
	private static HashSet<Employee> empSet = new HashSet<>();
	
	static {
		
		empSet.add(new Employee(123, "Mayank", 80000));
		empSet.add(new Employee(345, "Rajat", 90000));
		empSet.add(new Employee(678, "Gaurav", 50000));
		empSet.add(new Employee(342, "Ayush", 70000));
	}

	public static void main(String[] args) {
		
		//Read Operation
		if(empSet.isEmpty()) {
			System.out.println("No employes found");
		}
		else
		empSet.forEach(e -> System.out.println(e));
		
		//Create or Insert Operation
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee details empId, empName, Salary");
		Employee emp = new Employee(sc.nextLong(), sc.next(), sc.nextDouble());
		
		empSet.add(emp);
		
		//Update Operation:-
//		System.out.println("Enter employee id for updation");
//		
//		Long id = sc.nextLong();
//
//           if(empSet.contains(id))
		System.out.println("Enter employee id for updation");
		
		long updateId = sc.nextLong();
		boolean updated = false;
		
		System.out.println("Enter new name");
		String newName = sc.next();
		sc.nextLine();
		
		System.out.println("Enter new Salary");
		double newSalary = sc.nextDouble();
		for(Employee e: empSet) {
			if(e.getEmpId() == updateId) {
				e.setEmpName(newName);
				e.setSalary(newSalary);
				updated= true;
				break;
			}
		}
        	 
		if(updated) {
			
			System.out.println("employee updated successfully");
			
		}
		else
			System.out.println("Emp not found");
		
		//DELETE
		
		System.out.println("Enter the id of employee to be deleted");
		long tobeDeleted = sc.nextLong();
		
		Iterator<Employee> itr = empSet.iterator();
		boolean deleted = false;
		
		while(itr.hasNext()) {
			Employee e1 = itr.next();
			if(e1.getEmpId() == tobeDeleted) {
				itr.remove();
				deleted = true;
				break;
			}
		}
        	  if(deleted) {
        		  System.out.println("Employee deleted successfully");
        	  }
        	  else
        		 System.out.println("emp not found");
		
		
	}

}
