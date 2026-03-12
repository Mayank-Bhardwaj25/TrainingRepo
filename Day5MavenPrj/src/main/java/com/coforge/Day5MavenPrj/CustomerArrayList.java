package com.coforge.Day5MavenPrj;

import java.util.ArrayList;
import java.util.Collections;

public class CustomerArrayList {
	
	public static void main(String[] args) {
		
      Customer c1 = new Customer(1, "Mayank", "Lucknow", 90000.00);
      
      Customer c2 = new Customer(2, "Nitish", "Hyderabad", 80000.00);
      Customer c3 = new Customer(3, "Tanmay", "Pune", 70000.00);
      Customer c4 = new Customer(4 ,"Ayush", "Pune", 50000.00);
      
      
      ArrayList<Customer> custList = new ArrayList<>();
      
      custList.add(c1);
      custList.add(c2);
      custList.add(c3);
      custList.add(c4);
      
     // Collections.sort(custList);
      
      //orderCost Comparator
     // custList.sort(new OrderCostComparator());
      
      //city Comparator... it also reflects the chaining of Comparator below example
      custList.sort(new CityComparator().thenComparing(new OrderCostComparator()));
      
      custList.forEach(cust -> System.out.println(cust));
      
      
 	}

}
