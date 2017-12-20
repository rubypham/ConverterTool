
package com.auto.test.model;

public enum ServiceType {
	REST, SOAP, AWS;

	public static ServiceType getServiceType(String type) {
		if (type.equalsIgnoreCase("soap")) {
			return SOAP;
		} else if (type.equalsIgnoreCase("aws")) {
			return AWS;
		} else {
			return REST;
		}
	}
}
