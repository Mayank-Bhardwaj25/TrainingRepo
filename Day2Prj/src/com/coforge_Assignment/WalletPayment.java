package com.coforge_Assignment;

public class WalletPayment extends Payment {
	
	String bankName;
	long number;
	public WalletPayment() {
		super();
	}
	public WalletPayment(String bankName, long number, int amount) {
		super(amount);
		this.bankName = bankName;
		this.number = number;
	}

	public void pay() {
		System.out.println("Payment of "+amount+ "is paid usin wallet");
	}
	
	public void GeneratePaymentReceipt() {
		
		System.out.println("This is the payment Receipt");
		System.out.println("Contact:- " +number);
		System.out.println("Bank :-" + bankName );
		System.out.println("Amount Paid" +amount);
	}

	
}
