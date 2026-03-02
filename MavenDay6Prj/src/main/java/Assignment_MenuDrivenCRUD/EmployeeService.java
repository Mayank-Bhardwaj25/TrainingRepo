package Assignment_MenuDrivenCRUD;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


import com.coforge.MavenDay6Prj.Employee;

public class EmployeeService {
	
	private static  HashSet<Employee> empSet = new HashSet<>();
	
	static {
		empSet.add(new Employee(123, "Mayank", 80000));
		empSet.add(new Employee(345, "Rajat", 90000));
		empSet.add(new Employee(678, "Gaurav", 50000));
		empSet.add(new Employee(342, "Ayush", 70000));
	}
	
	//CREATE 
	public static boolean addEmployee(Employee emp) {
		return empSet.add(emp);
	}
	
	//READ
	
	public  static Set<Employee> getAllEmployee() {
		return empSet;
	}
	
	//get by id
	public static Employee getById(long id) {
		for(Employee emp : empSet) {
			if(emp.getEmpId() == id) {
				return emp;
			}
		}
		return null;
	}
	
	//UPDATE
	public  static boolean updateEmployee(long id, String newName, double newSalary) {
		
		Employee emp = getById(id); // using the above method.. it can be tight coupling for now... might change later..
		
		if(emp != null) {
				emp.setEmpName(newName);
				emp.setSalary(newSalary);
				return true;
			
			}
		return false;
		}
		
		
	
	//DELETE
	public static boolean deleteEmployee(long id) {
		Iterator<Employee> iterator = empSet.iterator();
		while(iterator.hasNext()) {
			Employee emp = iterator.next();
			
			if(emp.getEmpId() == id) {
				iterator.remove();
				return true;
			}
		}
		return false;
	}
	
	

}
