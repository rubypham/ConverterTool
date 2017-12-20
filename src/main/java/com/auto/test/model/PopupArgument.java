
package com.auto.test.model;

public enum PopupArgument {
	mainViewModel("mainViewModel"), parent("parent"), action("action"), testCase("testCase"), serviceName("serviceName"), expectation(
			"expectation");

	private PopupArgument(String name) {
		this.name = name;
	}

	private String name;

	public String toString() {
		return this.name;
	}
}
