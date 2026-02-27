package MenuDrivenPaymentMethod;

import java.util.Scanner;


public class MenuDrivenMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int choice;
		double amount;
		
		do {
			System.out.println("Here is the Menu");
			System.out.println("1. Wallet");
			System.out.println("2. Card");
			System.out.println("3. UPI");
			System.out.println("4. Net Banking");
			System.out.println("5. Exit");
			
			System.out.println("Enter your mode of payment from menu");
			
			choice = sc.nextInt();
			if(choice==5) {
			System.out.println("Exiting.. Thank you");
			break;
			}
			
			System.out.println("Enter the amount to PAY");
			amount = sc.nextDouble();
			
			Payment payment = null;
			
			switch(choice) {
			case 1: payment = new WalletPayment();
			break;
			
			case 2: payment = new CardPayment();
			 break;
			 
			case 3: payment = new UPIpayment();
			break;
			
			case 4 : payment = new NetBanking();
			break;
			
			default: System.out.println("Invalid mode of payment");
			}
			
			if(payment!=null) {
				payment.pay(amount);
			}
			
			
		}while(choice != 5);
		
		sc.close();
	}

}
