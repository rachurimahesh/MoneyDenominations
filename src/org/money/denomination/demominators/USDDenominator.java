package org.money.denomination.demominators;

import java.util.HashMap;
import java.util.Map;

import org.money.denomination.currencyunit.enums.CurrencyUnits;
import org.money.denomination.enums.USDCurrencyUnits;

public class USDDenominator implements Denominator {

	Map<CurrencyUnits, Integer> map;

	public Map<CurrencyUnits, Integer> convertInputCurrentcyLeastDenominations(String currency) {

		Integer inputValue = Integer.valueOf(currency.split("\\.")[0]);

		Integer inputValueAfterPeriod = Integer.valueOf(currency.split("\\.")[1]);

		map = new HashMap<>();

		while (inputValue >= 100) {
			map.put(USDCurrencyUnits.HUNDRED_DOLLARS, Math.toIntExact(inputValue / 100));
			inputValue = inputValue % 100;

			break;
		}
		while (inputValue >= 50) {

			map.put(USDCurrencyUnits.FIFTY_DOLLARS, Math.toIntExact(inputValue / 50));
			inputValue = inputValue % 50;

			break;
		}
		while (inputValue >= 20) {

			map.put(USDCurrencyUnits.TWENTY_DOLLARS, Math.toIntExact(inputValue / 20));

			inputValue = inputValue % 20;

			break;
		}
		while (inputValue >= 10) {
			map.put(USDCurrencyUnits.TEN_DOLLARS, Math.toIntExact(inputValue / 10));
			inputValue = inputValue % 10;
			break;
		}
		while (inputValue >= 5) {
			map.put(USDCurrencyUnits.FIVE_DOLLARS, Math.toIntExact(inputValue / 5));
			inputValue = inputValue % 5;
			break;
		}
		while (inputValue >= 2) {
			map.put(USDCurrencyUnits.TWO_DOLLARS, Math.toIntExact(inputValue / 2));
			inputValue = inputValue % 5;
			break;
		}
		while (inputValue >= 1) {
			map.put(USDCurrencyUnits.DOLLAR, Math.toIntExact(inputValue));
			inputValue = inputValue % 1;

			break;
		}

		lowerThanDollar(inputValueAfterPeriod);

		return map;

	}

	private void lowerThanDollar(int inputValueInCents) {

		while (inputValueInCents >= 25) {
			map.put(USDCurrencyUnits.QUARTER, inputValueInCents / 25);
			inputValueInCents = (int) (inputValueInCents % 25);

			break;
		}

		while (inputValueInCents >= 10) {
			map.put(USDCurrencyUnits.DIME, inputValueInCents / 10);
			inputValueInCents = (int) (inputValueInCents % 10);

			break;
		}

		while (inputValueInCents >= 5) {
			map.put(USDCurrencyUnits.NICKEL, inputValueInCents / 5);
			inputValueInCents = (int) (inputValueInCents % 5);

			break;
		}

		while (inputValueInCents >= 1) {
			map.put(USDCurrencyUnits.PENNIES, inputValueInCents / 1);
			inputValueInCents = (int) (inputValueInCents % 1);

			break;
		}

	}

}
