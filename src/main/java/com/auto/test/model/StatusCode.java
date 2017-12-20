/**
 * 
 * DIRECTV PROPRIETARY
 * Copyright© 2014 DIRECTV, INC.
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
