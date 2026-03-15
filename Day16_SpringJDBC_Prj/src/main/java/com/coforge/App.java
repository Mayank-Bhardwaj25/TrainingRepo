package com.coforge;

import java.util.Scanner;
import java.util.Set;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.coforge.config.AppConfig;
import com.coforge.dao.EmployeeDAO;
import com.coforge.entities.Employee;



/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        EmployeeDAO dao = context.getBean(EmployeeDAO.class);
        
       // Employee e = new Employee(123, "Mayank,", 80000);
        //Employee e = new Employee(567, "Rajat", 6000);
        //dao.insertEmployee(e);
        
        //dao.getAllEmployees().forEach(emp -> System.out.println(emp));
        //System.out.println("retriving one object");
        //System.out.println(dao.getEmployeeById((long) 123));
        
        //Employee e2 = new Employee(999, "Gaurav", 8999090);
        
       // dao.insertEmployee(e2);
        //dao.getAllEmployees().forEach(emp -> System.out.println(emp));
        
        //System.out.println(dao.updateEmployee(123,  e2));
        
        
        //Employee e3 = new Employee(567, "Mayank", 750000);
        
        //dao.deleteEmployee(999);
       // dao.updateEmployee(567, e3);
        //dao.getAllEmployees().forEach(emp -> System.out.println(emp));
        
        
        
        Scanner sc = new Scanner(System.in);
        int choice;
         
    	do {
    		System.out.println(" ---- This is Employee Management menu");
    		System.out.println("1.)  insert Employee");
    		System.out.println("2.) Read Employee");
    		System.out.println("3.) Update Employee");
    		System.out.println("4.) Delete Eemployee");
    		System.out.println("5.) Get employee by ID");
    		System.out.println("6.) Exit");
    		System.out.println("Enter your choice");
    		
    		 choice = sc.nextInt();
    		
    		switch(choice) {
    		
    		case 1: System.out.println("Enter ID: Enter id");
    		        long empid =  sc.nextLong();
    		       sc.nextLine();
    		        System.out.println("Enter name");
    		        String ename = sc.nextLine();
    		        sc.nextLine();
    		        System.out.println("Enter salary");
    		        double salary= sc.nextDouble();
    		        
    		        
    		        Employee emp = new Employee(empid, ename, salary);
    		        dao.insertEmployee(emp);
    		        
    		        break;
    		        
    		case 2 :
    			
    			System.out.println(dao.getAllEmployees());
    		break;
    		
    		
    		case 3: System.out.println("Enter id to update");
    		
    		long newId = sc.nextLong();
    		sc.nextLine();
    		System.out.println("ENter new name");
    		String newName = sc.nextLine();
    		
    		System.out.println("Enter new Salary");
    		double newSalary = sc.nextDouble();
    		
    		Employee emp3 = new Employee(newId, newName, newSalary);
    		dao.updateEmployee(emp3.getEmpid(), emp3);
    		break;
    		
    		
    		case 4: System.out.println("Enter id to delete");
    		long todeleteId= sc.nextLong();
    		
    		dao.deleteEmployee(todeleteId);
    		break;
    		
    		
    		case 5: System.out.println("Enter id to find employee");
    		
    		long Rid = sc.nextLong();
    		
    		System.out.println(dao.getEmployeeById(Rid));
    		
    		break;
    		
    		case 6: System.out.println("Exiting , thank you");
    		break;
    		
    		default: System.out.println("Invalid choice");
    		
    		}
    		
    		
    	} while(choice !=6);        
        
        
    	context.close();
    }
}
