
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
