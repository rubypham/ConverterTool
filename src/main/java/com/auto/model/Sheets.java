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
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class Sheets implements Serializable, Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected List<Sheet> sheet;

	public Sheets() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sheets(List<Sheet> sheet) {
		super();
		this.sheet = sheet;
	}

	public List<Sheet> getSheet() {
		if (this.sheet == null) {
			return new ArrayList<Sheet>();
		}
		return sheet;
	}

	@XmlElement(name = "Sheet")
	public void setSheet(List<Sheet> sheet) {
		this.sheet = sheet;
	}

}
