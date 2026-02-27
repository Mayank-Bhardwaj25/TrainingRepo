package MenuDrivenPaymentMethod;

public class WalletPayment implements  Payment {

	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Processing payment through wallet..");
		generateReceipt(amount);
		
	}

	@Override
	public void generateReceipt(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Payment through wallet is successfull");
		System.out.println("Amount Paid:- " +amount);
		System.out.println("Receipt ID is 46529859862");
		
	}

}
