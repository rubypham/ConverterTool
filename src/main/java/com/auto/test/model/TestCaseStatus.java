
package com.auto.test.model;

public enum TestCaseStatus {
	NOT_RUN("NOT RUN"), BLOCKED("BLOCKED"), PASSED("PASSED"), FAILED("FAILED");

	private String status;

	private TestCaseStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return this.status;
	}

}
