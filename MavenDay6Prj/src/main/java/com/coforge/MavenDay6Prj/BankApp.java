package com.coforge.MavenDay6Prj;

public class BankApp {

	public static void main(String[] args) {
		
		Account acc = new Account(123456, "Mayank", "SBI", 98789);
		try {
			acc.withDraw(1000);
		} catch (InsufficientFundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		acc.deposit(1000);
     
	}

}
