package MenuDrivenPaymentMethod;

public class UPIpayment implements Payment {

	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Processing UPI Payment ...");
		generateReceipt(amount);
		
	}

	@Override
	public void generateReceipt(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Upi payment successfull");
		System.out.println("Amount Paid:- "+amount);
		System.out.println("Receipt Id:- UPI392696");
		
	}

}
