
package com.auto.test.model;

public enum Method {
	GET, POST, PUT, DELETE, PATCH;

	public Method getMethod(String method) {
		if (method.equalsIgnoreCase("GET")) {
			return Method.GET;
		} else if (method.equalsIgnoreCase("PUT")) {
			return Method.PUT;
		} else if (method.equalsIgnoreCase("DELETE")) {
			return Method.DELETE;
		} else if (method.equalsIgnoreCase("PATCH")) {
			return Method.PATCH;
		} else {
			return Method.POST;
		}
	}
}
