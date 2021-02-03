package org.money.denomination.demominators;

import java.util.Map;

import org.money.denomination.currencyunit.enums.CurrencyUnits;

public interface Denominator {
	
	Map<CurrencyUnits, Integer> convertInputCurrentcyLeastDenominations(String currency);

}
