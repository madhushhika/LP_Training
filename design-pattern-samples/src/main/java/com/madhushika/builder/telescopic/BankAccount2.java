package com.madhushika.builder.telescopic;

public class BankAccount2 {


	long accountNumber;
	String owner;
	double balance;
	
	public BankAccount2(long accountNumber,String owner,double balance) {
		this.accountNumber =accountNumber;
		this.owner =owner;
		this.balance =balance;
	}
	
	public BankAccount2(long accountNumber,String owner) {
		this(accountNumber,owner,(Double) null);
	}
	public BankAccount2(long accountNumber) {
		this(accountNumber,null,(Double) null);
	}

	@Override
	public String toString() {
		return "BankAccount2 [accountNumber=" + accountNumber + ", owner=" + owner + ", balance=" + balance + "]";
	}
	
}
