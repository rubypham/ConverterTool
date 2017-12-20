
package com.auto.test.model;

public enum SortType {
	asc("ASCENDING"), desc("DESCENDING");

	private SortType(String typeName) {
		this.typeName = typeName;
	}

	private String typeName;

	@Override
	public String toString() {
		return this.typeName;
	}
}
