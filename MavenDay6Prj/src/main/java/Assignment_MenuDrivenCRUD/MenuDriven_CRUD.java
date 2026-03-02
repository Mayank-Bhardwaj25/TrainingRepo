package Assignment_MenuDrivenCRUD;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.coforge.MavenDay6Prj.Employee;

public class MenuDriven_CRUD {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int choice;
		
	
	do {
		System.out.println(" ---- This is Employee Management menu");
		System.out.println("1.)  Create Employee");
		System.out.println("2.) Read Employee");
		System.out.println("3.) Update Employee");
		System.out.println("4.) Delete Eemployee");
		System.out.println("5.) Get employee by ID");
		System.out.println("5.) Exit");
		
		System.out.println("Enter your choice");
		
		choice = sc.nextInt();
		
		switch(choice) {
		
		case 1: System.out.println("Enter ID: Enter id");
		        long id =  sc.nextLong();
		       sc.nextLine();
		        System.out.println("Enter name");
		        String name = sc.nextLine();
		        sc.nextLine();
		        System.out.println("Enter salary");
		        double salary= sc.nextDouble();
		        
		        Employee emp = new Employee(id, name, salary);
		        
		        if(EmployeeService.addEmployee(emp))
		        	System.out.println("Employee Added Successfully");
		        else
		        	System.out.println("Employee already exists");
		        break;
		        
		case 2 : if(EmployeeService.getAllEmployee() != null) {
			   Set  <Employee> emp1 = EmployeeService.getAllEmployee();
			   emp1.forEach(e -> System.out.println(e));
		}
		else
			System.out.println("no employees exists");
		break;
		
		
		case 3: System.out.println("Enter id to update");
		
		long newId = sc.nextLong();
		sc.nextLine();
		System.out.println("ENter new name");
		String newName = sc.nextLine();
		
		System.out.println("Enter new Salary");
		double newSalary = sc.nextDouble();
		
		
		if(!(EmployeeService.updateEmployee(newId, newName, newSalary))){
			System.out.println("Employee not found");
		}
		else {
			EmployeeService.updateEmployee(newId, newName, newSalary);
			System.out.println("Updated succesfully");
		}
		break;
		
		case 4: System.out.println("Enter id to delete");
		long todeleteId= sc.nextLong();
		
		if(EmployeeService.deleteEmployee(todeleteId)) {
			System.out.println("Employe deleted");
		}
		else
			System.out.println("Cant be deleted");
		
		break;
		
		
		case 5: System.out.println("Enter id to find employee");
		
		long Rid = sc.nextLong();
		
		Employee emp3 = EmployeeService.getById(Rid);
		
		if(emp3 !=null) {
			System.out.println(emp3);
			
		}
		else
			System.out.println("not found");
		break;
		
		case 6: System.out.println("Exiting , thank you");
		break;
		
		default: System.out.println("Invalid choice");
		
		}
		
	} while(choice !=6);
		

		
	}

}
