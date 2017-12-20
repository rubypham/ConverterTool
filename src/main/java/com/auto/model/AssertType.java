/**
 * 
 * DIRECTV PROPRIETARY
 * Copyright� 2014 DIRECTV, INC.
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
