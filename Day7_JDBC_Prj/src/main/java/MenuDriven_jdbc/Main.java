package MenuDriven_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Connection conn = DBConnection.getConnection();
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("1. INSERT");
			System.out.println("2. DISPLAY");
			System.out.println("3. UPDATE");
			System.out.println("4. DELETE");
			System.out.println("5. EXIT");
			
			System.out.println("ENter choice");
			
			 choice  = sc.nextInt();
			
			switch(choice) {
			case 1: 
				System.out.println("Enter id, name and salary");
				int id = sc.nextInt();
				sc.nextLine();
				String name = sc.nextLine();
				double salary = sc.nextDouble();
				
				PreparedStatement ps = conn.prepareStatement("insert into employees values (?, ?, ?)");
				ps.setInt(1, id);
				ps.setString(2, name);
				ps.setDouble(3, salary);
				ps.executeUpdate();
				System.out.println("Insertion successful !");
				break;
				
				//DISPLAY
			case 2:
				Statement st = conn.createStatement();
				ResultSet rs = st.executeQuery("select * from employees");
				
				while(rs.next()) {
					System.out.println(
							rs.getInt(1) +" " +
					rs.getString(2) + " "+
									rs.getDouble(3)
							
							
							
							);
					
					
					
				}
				break;
					case 3:
						System.out.println("enter id , name and salary");
						int id1 = sc.nextInt();
						sc.nextLine();
						
						String name1= sc.nextLine();
					  double salary1 = sc.nextDouble();
						
						PreparedStatement ps1 = conn.prepareStatement("update employees set empNam = ?, salary = ? where empId = ?");
						ps1.setString(1, name1);
						ps1.setDouble(2, salary1);
						ps1.setInt(3, id1);
						
						ps1.executeUpdate();
						break;
						
					case 4 :
						System.out.println("Enter id");
						PreparedStatement ps3 = conn.prepareStatement("delete from employees where empId = ?");
						
						ps3.setInt(1, sc.nextInt());
						ps3.executeUpdate();
						System.out.println("deleted");
						break;
						
					case 5:
						System.out.println("Exiting, thank u");
						
						default:
							System.out.println("Invaid");
						
				}
			}while(choice !=5);
			
		}
		
	}

