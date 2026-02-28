package com.coforge_Assignment;

public class PaymentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Payment card = new CardPayment(1234567, "12/12/2028", 123,  80000);
		card.pay();
		card.GeneratePaymentReceipt();
		
		Payment wallet = new WalletPayment("SBI", 3638743, 90000);
		wallet.pay();
		wallet.GeneratePaymentReceipt();
		
		Payment upi = new UPIpayment("Mayank@sbi", "SBI", 34673);
		upi.pay();
		upi.GeneratePaymentReceipt();
		

	}

}
