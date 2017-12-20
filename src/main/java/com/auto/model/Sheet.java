/**
 * 
 * DIRECTV PROPRIETARY
 * Copyright� 2017 DIRECTV, INC.
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
import javax.xml.bind.annotation.XmlElement;

public class Sheet implements Serializable, Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected String name;
	protected DataFile dataFile;
	protected TestIDs testIDs;
	protected Keywords keywords = new Keywords();

	public Sheet() {
		super();
	}

	public Sheet(String name, DataFile dataFile, TestIDs testIDs, Keywords keywords) {
		super();
		this.name = name;
		this.dataFile = dataFile;
		this.testIDs = testIDs;
		this.keywords = keywords;
	}

	public String getName() {
		return name;
	}

	@XmlAttribute
	public void setName(String name) {
		this.name = name;
	}

	public DataFile getDataFile() {
		return dataFile;
	}

	@XmlElement(name = "DataFile")
	public void setDataFile(DataFile dataFile) {
		this.dataFile = dataFile;
	}

	public TestIDs getTestIDs() {
		return testIDs;
	}

	@XmlElement(name = "TestIDs")
	public void setTestIDs(TestIDs testIDs) {
		this.testIDs = testIDs;
	}

	public Keywords getKeywords() {
		return keywords;
	}

	@XmlElement(name = "Keywords")
	public void setKeywords(Keywords keywords) {
		this.keywords = keywords;
	}

}
