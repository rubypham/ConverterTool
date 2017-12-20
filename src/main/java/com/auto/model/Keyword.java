package com.auto.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Keyword implements Serializable, Cloneable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private List<Params> params;

	public Keyword() {
	}

	

	public Keyword(String name, List<Params> params) {
		super();
		this.name = name;
		this.params = params;
	}

	public String getName() {
		return this.name;
	}

	@XmlAttribute
	public void setName(String name) {
		this.name = name;
	}

	public List<Params> getParams() {
		if (this.params == null) {
			return new ArrayList<Params>();
		}
		return params;
	}

	@XmlElement(name = "Params")
	public void setParams(List<Params> params) {
		this.params = params;
	}

}
