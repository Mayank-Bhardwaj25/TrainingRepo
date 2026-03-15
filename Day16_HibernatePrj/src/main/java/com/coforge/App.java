package com.coforge;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.coforge.dao.ItemDAO;
import com.coforge.dao.OrderDAO;

import com.coforge.entities.Item;
import com.coforge.entities.Order;



/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
   
//    	ItemDAO dao = new ItemDAO(); 
//    	//dao.getAllItem().forEach( -> System.out.println(itm));
//    	//dao.insertItem(new Item(7, "mouse", 19099));
//    	dao.getAllItem().forEach(item -> System.out.println(item));
//    	System.out.println(dao.getById(7));
//    	
//    	OrderDAO ord = new OrderDAO();
//    	
//    	
//    	ord.insertOrder(new Order("Mayank",LocalDate.parse("2026-12-12")));
//    	ord.getAllOrders().forEach(o -> System.out.println(o));
    	
    	
    	Scanner sc = new Scanner(System.in);
    	
    	ItemDAO itemdao = new ItemDAO();
    	OrderDAO orderdao = new OrderDAO();
    	
    	int mainChoice;
    	do {
    		System.out.println("\n+++++++ MAIN MENU ++++++++");
    		System.out.println("1.) Item Operations");
    		System.out.println("2. Order Operations");
    		System.out.println("3.) Exit");
    		System.out.println("Enter choice");
    		
    		mainChoice = sc.nextInt();
    		switch(mainChoice) {
    		
    		case 1: int itemChoice;
    			do {
    				System.out.println("\n-----ITEM MENU----");
    				System.out.println(" ---- This Item menu");
    	    		System.out.println("1.)  insert Item");
    	    		System.out.println("2.) Read Item");
    	    		System.out.println("3.) Update Item");
    	    		System.out.println("4.) Delete Item");
    	    		System.out.println("5.) Get Item by ID");
    	    		System.out.println("6.) Exit");
    	    		System.out.println("Enter your choice");
    	    		itemChoice = sc.nextInt();
    	    		
    	    		switch(itemChoice) {
    	    		
    	    		case 1: System.out.println("Enter item id : ");
    	    		        long itemid =  sc.nextLong();
    	    		       sc.nextLine();
    	    		        System.out.println("Enter Item  name");
    	    		        String itmname = sc.nextLine();
    	    		        sc.nextLine();
    	    		        System.out.println("Enter price ");
    	    		        double price= sc.nextDouble();
    	    		        
    	    		        
    	    		        Item item = new Item(itemid, itmname, price);
    	    		        itemdao.insertItem(item);
    	    		        
    	    		        break;
    	    		        
    	    		case 2: List<Item> items = itemdao.getAllItem();
    	    		for(Item i : items) {
    	    			System.out.println(i.getId() +" " +i.getName() + " " + i.getCost());
    	    		}
    				break;
    				
    	    		case 3: System.out.println("Enter id to update");
    	    		
    	    		long newId = sc.nextLong();
    	    		sc.nextLine();
    	    		System.out.println("ENter new name");
    	    		String newName = sc.nextLine();
    	    		
    	    		System.out.println("Enter new Price");
    	    		double newPrice = sc.nextDouble();
    	    		
    	    		Item itm = new Item(newId, newName, newPrice);
    	    		itemdao.updateItem(itm);
    	    		break;
    				
    	    		case 4: System.out.println("Enter id to delete");
    	    		long todeleteId= sc.nextLong();
    	    		
    	    		itemdao.deleteItem(todeleteId);
    	    		break;
    	    		
    	    		
    	    		case 5: System.out.println("Enter id to find item");
    	    		
    	    		long Rid = sc.nextLong();
    	    		
    	    	 Item result = itemdao.getById(Rid);
    	    	 if(result!=null) {
    	    		 System.out.println(result.getId() + " " +result.getName() + " "+result.getCost());
    	    		 
    	    	 }
    	    	 else {
    	    		 System.out.println("No item found");
    	    	 }
    	    		
    	    		break;
    			}
    			}while(itemChoice!=6);
    			break;
    			
    			
    			
    			
    			//For order
    			
    		case 2:
    			int orderChoice;
    			do {
    				
    				
    				System.out.println("\n-----Order MENU----");
    				System.out.println(" ---- This is Order menu");
    	    		System.out.println("1.)  insert Order");
    	    		System.out.println("2.) Read order");
    	    		System.out.println("3.) Update order");
    	    		System.out.println("4.) Delete Order");
    	    	
    	    		System.out.println("5.) Back");
    	    		System.out.println("Enter your choice");
    	    		orderChoice = sc.nextInt();
    	    		
    	    		switch(orderChoice) {
    	    		
    	    		
    	    		case 1: 
    	    			System.out.println("Enter Customer  name");
    		        String custname = sc.next();
    		        
    		        System.out.println("Enter order date ");
    		        String date = sc.next();
    		        
    		        
    		        Order order = new Order(custname, LocalDate.parse(date));
    		        orderdao.insertOrder(order);
    		        
    		        break;
    	    		case 2:  List<Order> orders = orderdao.getAllOrders();
    	    		for(Order o : orders) {
    	    			System.out.println(o.getOrdId() +" " +o.getCustName() + " " + o.getOrdDate());
    	    		}
    				break;
    		        
    		        
    	    		case 3: 
    	    			System.out.println("Enter id to update");
        	    		
        	    		int newId = sc.nextInt();
        	    		sc.nextLine();
        	    		System.out.println("ENter new name");
        	    		String newName = sc.nextLine();
        	    		
        	    		System.out.println("Enter new Date");
        	    		String newDate = sc.nextLine();
        	    		
        	    		Order upOrder = new Order(newName, LocalDate.parse(newDate));
        	    		upOrder.setOrdId(newId);
        	    		orderdao.updateOrder(upOrder);
        	    		
        	    		break;
    	    			
    	    		case 4: System.out.println("Enter id to delete");
    	    		int todeleteId= sc.nextInt();
    	    		
    	    		orderdao.deleteOrder(todeleteId);
    	    		break;
    	    		}
    			}while(orderChoice!=5);
    			break;
    		
    		}
    	}while(mainChoice!=3);
    	sc.close();
    }
}
    
    	
    	
    	
    	
        
 
