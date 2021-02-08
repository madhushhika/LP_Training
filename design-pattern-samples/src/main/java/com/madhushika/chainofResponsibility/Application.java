package com.madhushika.chainofResponsibility;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {

			do {

				System.out.println(

						"Please enter amount to withdraw (multiple of 10, max Rs10000): ");

				int amount = scanner.nextInt();

				if (isValid(amount)) {

					ATMWithdrawal.withdraw(new PaperCurrency(amount));

				}

			} while (true);

		}

	}

	private static boolean isValid(int amount) {

		if (amount <= 0) {

			System.out.println("Invalid amount. Try again!");

			return false;

		} else if (amount > 100000) {

			System.out.println("Daily withdrawal limit is 100000. Try again!");

			return false;

		} else if (amount % 10 != 0) {

			System.out.println("Amount must be mutiple of 10s, Try again!");

			return false;

		}

		return true;

	}
}
