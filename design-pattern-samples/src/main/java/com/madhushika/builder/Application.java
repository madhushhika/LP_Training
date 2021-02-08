package com.madhushika.builder;

public class Application {

	public static void main(String[] args) {
		BankAccount.Builder builder = new BankAccount.Builder(34124);
		BankAccount bankAccount = builder.branch("Nittambuwa").interestRate(7.1).build();
		System.out.print(bankAccount);
	}
}