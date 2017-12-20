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

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Scenario")
public class Scenario implements Serializable, Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected Sheets sheets;

	public Scenario() {
		super();
		this.sheets = new Sheets();
	}

	public Scenario(Sheets sheets) {
		super();
		this.sheets = sheets;
	}

	public Sheets getSheets() {
		return sheets;
	}

	@XmlElement(name = "Sheets")
	public void setSheets(Sheets sheets) {
		this.sheets = sheets;
	}

}
