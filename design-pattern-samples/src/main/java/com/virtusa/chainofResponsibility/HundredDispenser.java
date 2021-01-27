package com.virtusa.chainofResponsibility;

public class HundredDispenser extends PaperCurrencyDispenser {

	public HundredDispenser() {
		super();
	}

	@Override
	public void dispense(PaperCurrency currency) {

		if (currency != null) {

			int amount = currency.getAmount();

			int remainder = amount;

			if (amount >= 100) {

				int count = amount / 100;

				remainder = amount % 100;

				System.out.printf("Dispensing '%d' Rs100 currency note.", count);

			}

			if (remainder > 0 && this.nextDispenser != null) {

				this.nextDispenser.dispense(new PaperCurrency(remainder));

			}

		}

	}

}
