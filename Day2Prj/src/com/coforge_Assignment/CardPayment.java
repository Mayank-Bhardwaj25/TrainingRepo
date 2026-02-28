package com.coforge_Assignment;

public class CardPayment extends Payment{
	int cvv;
	String expiry_date;
	long cardNum;
	
	public CardPayment() {
		super();
	}

	public CardPayment(int cvv, String expiry_date, long cardNum, int amount) {
		super(amount);
		this.cvv = cvv;
		this.expiry_date = expiry_date;
		this.cardNum = cardNum;
	}
	
	public void pay() {
		System.out.println("Payment of "+amount+" is done using card");
	}
	
	public void GeneratePaymentReciept() {
		
	}
}
