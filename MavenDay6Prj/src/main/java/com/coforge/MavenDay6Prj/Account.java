package com.coforge.MavenDay6Prj;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString

public class Account {
	
	private long accNum;
	private String accHolder;
	private String bankName;
	private double balance;
	
	public void withDraw(double amount) throws InsufficientFundsException {
		if(amount<=this.balance) {
			this.balance -= amount;
			System.out.println("Withdraw of " +amount+ " is successful!");
		}
		else {
			throw new InsufficientFundsException("Amount is more than Balance");
			
		}
	}
	
	public void deposit(double amount) {
		this.balance +=amount;
		
		System.out.println(amount +" deposited successfully !");
	}
	

}
