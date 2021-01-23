package com.virtusa.builder.telescopic;

public class Application {

	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount(2443);
		System.out.print(bankAccount);
		BankAccount2 bankAccount2 = new BankAccount2(2443);
		System.out.print(bankAccount2);
		
	}
}
