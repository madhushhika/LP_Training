package com.madhushika.builder;

public class BankAccount {

	private final long accountNumber;
	private final String owner;
	private final String branch;
	private final double interestRate;
	private final double balance;

	public BankAccount(Builder builder) {
		this.accountNumber = builder.accountNumber;
		this.owner = builder.owner;
		this.branch = builder.branch;
		this.interestRate= builder.interestRate;
		this.balance = builder.balance;
	}

	static class Builder {
		private long accountNumber;
		private String owner;
		private String branch;
		private double interestRate;
		private double balance;

		public BankAccount build() {
			return new BankAccount(this);
		}

		public Builder(long accountNumber) {
			this.accountNumber = accountNumber;
		}

		public Builder owner(String owner) {
			this.owner = owner;
			return this;
		}

		public Builder branch(String branch) {
			this.branch = branch;
			return this;

		}

		public Builder interestRate(double interestRate) {
			this.interestRate = interestRate;
			return this;
		}

		public Builder(double balance) {
			this.balance = balance;

		}

	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", owner=" + owner + ", branch=" + branch
				+ ", interestRate=" + interestRate + ", balance=" + balance + "]";
	}
	

}
