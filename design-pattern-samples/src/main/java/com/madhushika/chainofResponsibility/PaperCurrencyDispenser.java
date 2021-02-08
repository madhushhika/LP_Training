package com.madhushika.chainofResponsibility;

public abstract class PaperCurrencyDispenser { // Handler class

	protected PaperCurrencyDispenser nextDispenser;// nextDispenser is my successor

	public void setNextDispenser(PaperCurrencyDispenser nextDispenser) {

		this.nextDispenser = nextDispenser;

	}

	public abstract void dispense(PaperCurrency currency);
}
