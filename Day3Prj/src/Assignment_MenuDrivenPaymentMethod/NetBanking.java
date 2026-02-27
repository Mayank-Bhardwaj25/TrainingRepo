package MenuDrivenPaymentMethod;

public class NetBanking implements Payment{

	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Processing net banking payment...");
		generateReceipt(amount);
		
	}

	@Override
	public void generateReceipt(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Net Banking payment successful");
		System.out.println("Amount Paid:- "+amount);
		System.out.println("RecieptId :- NET769269");
		
	}

}
