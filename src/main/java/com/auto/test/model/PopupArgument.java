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
