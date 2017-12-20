
package com.auto.test.model;

public enum StatusCode {
	OK("200"), BAD_REQUEST("400"), UNAUTHORIZED("401"), NOT_FOUND("404"), INTERNAL_SERVER_ERROR("500"), BANDWIDTH_LIMIT_EXCEEDED("509");

	private StatusCode(String name) {
		this.name = name;
	}

	private String name;

	public String toString() {
		return this.name;
	}
}
