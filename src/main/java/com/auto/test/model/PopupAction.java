
package com.auto.test.model;

public enum PopupAction {
	add("add"), edit("edit");

	private PopupAction(String name) {
		this.name = name;
	}

	private String name;

	public String toString() {
		return this.name;
	}
}
