package com.coforge_Assignment;

public class UPIpayment extends Payment {
	 
	String upiId;
	String bankName;
	public UPIpayment() {
		super();
	}
	public UPIpayment(String upiId, String bankName, int amount) {
		super(amount);
		this.upiId = upiId;
		this.bankName = bankName;
	}
	
	public void pay() {
		System.out.println("Payment of" +amount+ "is done using UPI");
	}
      public void GeneratePaymentReceipt() {
    	  System.out.println("Here is the payment reciept with details");
    	  System.out.println("Bank Name:-" + bankName);
    	  System.out.println("Paid Amount:- " +amount);
    	  
      }
}
