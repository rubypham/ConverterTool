
package com.auto.test.model;

public enum FormatType {
	JSON("json"), XML("xml"), EXCEL("xls");

	private FormatType(String formatType) {
		this.formatType = formatType;
	}

	private String formatType;

	@Override
	public String toString() {
		return this.formatType;
	}
}
