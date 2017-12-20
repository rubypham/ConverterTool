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
