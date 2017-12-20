
package com.auto.model;

public enum AssertType {
	isNull("isNull"), isEmpty("isEmpty");

	AssertType(String assertType) {
		this.assertType = assertType;
	}

	private String assertType;

	@Override
	public String toString() {
		return this.assertType;
	}

	public static void main(String[] args) {
		int i = 0;
		while (true) {
			i++;
			Object o = new Object();
			System.out.println(o.toString() + i);
		}
	}
}
