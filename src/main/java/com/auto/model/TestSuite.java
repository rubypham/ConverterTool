package com.auto.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "testSuite", propOrder = { "summary", "testCase", "filePath" })
public class TestSuite implements Serializable {

	private final static long serialVersionUID = 1L;
	@XmlElement(required = true)
	protected String summary;
	protected List<TestCase> testCase;
	@XmlAttribute(name = "id")
	protected String id;
	private String filePath = "";
	private transient int failedCase;

	/**
	 * Gets the value of the summary property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSummary() {
		return summary;
	}

	/**
	 * Sets the value of the summary property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSummary(String value) {
		this.summary = value;
	}

	/**
	 * Gets the value of the testCase property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the testCase property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getTestCase().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link TestCase
	 * }
	 * 
	 * 
	 */
	public List<TestCase> getTestCase() {
		if (testCase == null) {
			testCase = new ArrayList<TestCase>();
		}
		return this.testCase;
	}

	/**
	 * Gets the value of the id property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the value of the id property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setId(String value) {
		this.id = value;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public int getFailedCase() {
		return failedCase;
	}

	public void setFailedCase(int failedCase) {
		this.failedCase = failedCase;
	}

}
