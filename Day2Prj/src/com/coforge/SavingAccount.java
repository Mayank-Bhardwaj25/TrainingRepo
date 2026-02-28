package com.coforge;

public class SavingAccount extends Account{
  double minBal;

  public SavingAccount() {
	super();
  }

  public SavingAccount(String accHolderName, long accNum, String branchName, String IFSC, double balance, double minBal) {
	  
	super(accHolderName, accNum, branchName, IFSC, balance);
	this.minBal = minBal;
  }
  
  public void withdraw(double amount) {
	  if(amount < 0) {
		  System.out.println("not possible");
	  }
	  
	  else if(this.balance-amount < this.minBal)
		  System.out.println("amount to be withdrwa is more than sa minn balance");
	  else {
		  this.balance-=amount;
		  System.out.println("withdrwa successful");
	  }
  }

  @Override
  public String toString() {
	return "SavingAccount [minBal=" + minBal + "]";
  }
  
  
}
