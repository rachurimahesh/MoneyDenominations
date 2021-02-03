package org.money.denomination;

import java.util.Map;

import org.money.denomination.convertor.CurrencyConvertor;
import org.money.denomination.currencyunit.enums.CurrencyUnits;
import org.money.denomination.enums.CurrencyType;

public class DenominatorApplication {

	public static void main(String[] args) {

		CurrencyConvertor convertor = new CurrencyConvertor();

		Map<CurrencyUnits, Integer> map = convertor.convertInputCurrentcyLeastDenominations("255.25", CurrencyType.USD);

		System.out.println(map);

	}

}
