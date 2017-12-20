/**
 * 
 * DIRECTV PROPRIETARY
 * Copyright© 2017 DIRECTV, INC.
 * UNPUBLISHED WORK
 * ALL RIGHTS RESERVED
 * 
 * This software is the confidential and proprietary information of
 * DIRECTV, Inc. ("Proprietary Information").  Any use, reproduction, 
 * distribution or disclosure of the software or Proprietary Information, 
 * in whole or in part, must comply with the terms of the license 
 * agreement, nondisclosure agreement or contract entered into with 
 * DIRECTV providing access to this software.
 */
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
