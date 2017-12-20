
package com.auto.test.model;

public enum TestFunction {
	count("count"), sort("sort");
	private TestFunction(String functionName) {
		this.functionName = functionName;
	}

	private String functionName;

	@Override
	public String toString() {
		return this.functionName;
	}
}
