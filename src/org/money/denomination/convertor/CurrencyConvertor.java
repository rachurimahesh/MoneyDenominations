package org.money.denomination.convertor;

import java.util.Map;

import org.money.denomination.currencyunit.enums.CurrencyUnits;
import org.money.denomination.demominators.CADDenominator;
import org.money.denomination.demominators.Denominator;
import org.money.denomination.demominators.INRDenominator;
import org.money.denomination.demominators.USDDenominator;
import org.money.denomination.enums.CurrencyType;

public class CurrencyConvertor {

	private Denominator denominator;

	public Map<CurrencyUnits, Integer> convertInputCurrentcyLeastDenominations(String inputValue,
			CurrencyType currencyType) {

		switch (currencyType) {

		case USD:
			denominator = new USDDenominator();
			return denominator.convertInputCurrentcyLeastDenominations(inputValue);

		case CAD:
			denominator = new CADDenominator();
			return denominator.convertInputCurrentcyLeastDenominations(inputValue);

		case INR:
			denominator = new INRDenominator();
			return denominator.convertInputCurrentcyLeastDenominations(inputValue);
		default:
			break;
		}
		return null;

	}
}
