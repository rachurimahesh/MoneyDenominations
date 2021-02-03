package org.money.denomination.enums;

public enum CurrencyType {

	USD("American Dollar"),

	INR("Indian Rupee"),

	CAD("Canadian Dollar");

	private String currenyType;

	CurrencyType(String currenyType) {

		this.currenyType = currenyType;

	}

	public String getValue() {
		return currenyType;
	}

}
