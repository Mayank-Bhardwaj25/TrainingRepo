package MenuDrivenPaymentMethod;

public interface Payment {

	void pay(double amount) ;
	void generateReceipt(double amount);
}

