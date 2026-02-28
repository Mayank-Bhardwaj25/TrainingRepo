package com.coforge;

 abstract public class Account {

	 protected String accHolderName;
	 protected long accNum;
	 protected String branchName;
	 protected String IFSC;
	 protected double balance;
	 
	 public Account() {
		super();
	 }

	 public Account(String accHolderName, long accNum, String branchName, String iFSC, double balance) {
		super();
		this.accHolderName = accHolderName;
		this.accNum = accNum;
		this.branchName = branchName;
		IFSC = iFSC;
		this.balance = balance;
	 }

	 public String getAccHolderName() {
		 return accHolderName;
	 }

	 public void setAccHolderName(String accHolderName) {
		 this.accHolderName = accHolderName;
	 }

	 public long getAccNum() {
		 return accNum;
	 }

	 public void setAccNum(long accNum) {
		 this.accNum = accNum;
	 }

	 public String getBranchName() {
		 return branchName;
	 }

	 public void setBranchName(String branchName) {
		 this.branchName = branchName;
	 }

	 public String getIFSC() {
		 return IFSC;
	 }

	 public void setIFSC(String iFSC) {
		 IFSC = iFSC;
	 }

	 public double getBalance() {
		 return balance;
	 }

	 public void setBalance(double balance) {
		 this.balance = balance;
	 }

	 @Override
	 public String toString() {
		return "Account [accHolderName=" + accHolderName + ", accNum=" + accNum + ", branchName=" + branchName
				+ ", IFSC=" + IFSC + ", balance=" + balance + "]";
	 }
	 
	 
	 public void withdraw(double amount ) {
		 if(amount < 0) 
			 System.out.println("can not be withdrwa");
		 
		 else
			 if(amount>this.balance)
				 System.out.println("Insufficent funds");
			
		else {
			this.balance-=amount;
			System.out.println("withdraw successful");
		}
				 
	 }
	 
	 public void deposit(double amount) {
		 this.balance +=amount;
		  
			System.out.println("Amount deposited");
		
	 }
 }
