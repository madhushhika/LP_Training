package com.virtusa.chainofResponsibility;

public class ATMWithdrawal {
	 static PaperCurrencyDispenser hundredDispenser = new HundredDispenser();
	 static PaperCurrencyDispenser fiftyDispenser = new FiftyDispenser();
	 static PaperCurrencyDispenser dispenserChain;

	static {

		hundredDispenser.setNextDispenser(fiftyDispenser);
        dispenserChain = hundredDispenser;

	}

	public static void withdraw(PaperCurrency currency) {

		if (currency != null) {

			dispenserChain.dispense(currency);

		}

	}
}
