package com.coforge_Assignment;

public class Payment {
	protected int amount;

	public Payment() {
		super();
	}

	public Payment(int amount) {
		super();
		this.amount = amount;
	}
	
	 public void pay() {
	   System.out.println("Parent class Pay method called");
	}
	 
	 public void GeneratePaymentReceipt() {
		 System.out.println("This is the Payment Receipt");
		 System.out.println("Amount Paid:-" +amount);
	 }
	 

}
