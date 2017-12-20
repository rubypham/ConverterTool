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
package com.auto.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;

public class TestIDs implements Serializable, Cloneable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected String name;

	public TestIDs() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TestIDs(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@XmlAttribute
	public void setName(String name) {
		this.name = name;
	}

}
