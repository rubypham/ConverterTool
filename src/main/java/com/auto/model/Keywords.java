package com.auto.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class Keywords implements Serializable, Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected List<Keyword> keyword;

	public Keywords() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public List<Keyword> getKeyword() {
		if (this.keyword == null) {
			return new ArrayList<Keyword>();
		}
		return keyword;
	}

	@XmlElement(name = "Keyword")
	public void setKeyword(List<Keyword> keyword) {
		this.keyword = keyword;
	}

}
