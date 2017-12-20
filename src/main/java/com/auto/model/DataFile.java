package com.auto.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;

public class DataFile implements Serializable, Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected String name;
	protected String sheet;

	public DataFile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DataFile(String name, String sheet) {
		super();
		this.name = name;
		this.sheet = sheet;
	}

	public String getName() {
		return name;
	}

	@XmlAttribute
	public void setName(String name) {
		this.name = name;
	}

	public String getSheet() {
		return sheet;
	}

	@XmlAttribute(name = "Sheet")
	public void setSheet(String sheet) {
		this.sheet = sheet;
	}

}
