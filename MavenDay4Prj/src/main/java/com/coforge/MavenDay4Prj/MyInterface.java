package com.coforge.MavenDay4Prj;


public interface MyInterface {
	
	public void display();
	
	public default void printDetails() {
		
		System.out.println("Default Method of myInterface invoked");
	}
	
	public static void UseParking(String companyName) {
		
		System.out.println("This is " + companyName + " using parking area");
		
	}
	
	

}
