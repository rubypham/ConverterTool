package com.auto.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "testSuite" })
@XmlRootElement(name = "testSuites")
public class TestSuites implements Serializable {

	private final static long serialVersionUID = 1L;
	protected List<TestSuite> testSuite;

	private transient Date startTime;
	private transient Date endTime;

	public List<TestSuite> getTestSuite() {
		if (testSuite == null) {
			testSuite = new ArrayList<TestSuite>();
		}
		return this.testSuite;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
}
