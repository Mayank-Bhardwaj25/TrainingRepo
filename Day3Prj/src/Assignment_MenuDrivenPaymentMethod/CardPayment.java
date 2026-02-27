package MenuDrivenPaymentMethod;

public class CardPayment implements Payment{

	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Processing payment through Card");
		generateReceipt(amount);
		
	}

	@Override
	public void generateReceipt(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Card payment successfull");
		System.out.println("Amount Paid" + amount);
	System.out.println("Receipt Id is :- CRD449824" );
		
	}
	

}
