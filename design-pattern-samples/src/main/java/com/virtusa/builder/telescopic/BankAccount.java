package com.virtusa.builder.telescopic;

public class BankAccount {

	long accountNumber;
	String owner;
	double balance;
	
	public BankAccount(long accountNumber) {
		this.accountNumber= accountNumber;
		
	}
	public BankAccount(long accountNumber,String owner) {
		this(accountNumber);
		this.owner = owner;
	}
	public BankAccount(long accountNumber,String owner,double balance) {
		this(accountNumber,owner);
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", owner=" + owner + ", balance=" + balance + "]";
	}
	
}
