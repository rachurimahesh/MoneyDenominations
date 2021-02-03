package org.money.denomination.enums;

import org.money.denomination.currencyunit.enums.CurrencyUnits;

public enum USDCurrencyUnits implements CurrencyUnits{

	HUNDRED_DOLLARS(100),

	FIFTY_DOLLARS(50),

	TWENTY_DOLLARS(20),

	TEN_DOLLARS(10),

	FIVE_DOLLARS(5),
	
	TWO_DOLLARS(2),

	DOLLAR(1),

	QUARTER(25),

	DIME(10),

	NICKEL(5),

	PENNIES(1);

	private int value;

	USDCurrencyUnits(int value) {

		this.value = value;

	}

	public int getValue() {
		return value;
	}

}
