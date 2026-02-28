package com.coforge;

public class CurrentAccount extends Account{
  
	private double odLimit;

	public CurrentAccount() {
		super();
	}

	public CurrentAccount(double odLimit) {
		super();
		this.odLimit = odLimit;
	}
	
	@Override
	public void withdraw(double amount) {
		if(amount<=0) {
			System.out.println("not possible");
		}
		else if(amount > balance+odLimit) {
			System.out.println("not possible, od limit exceeded");
		}
		else {
			this.balance-=amount;
		}
	}
	
}
