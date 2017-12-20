package com.auto.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "testCase", propOrder = { "description", "testData", "testParam", "userInfo", "method", "expectedResult", "passed",
		"message", "output" })
public class TestCase implements Serializable, Cloneable {

	private final static long serialVersionUID = 1L;
	@XmlElement(required = true)
	private String description;
	@XmlElement(required = true)
	private String testData;
	@XmlElement(required = true)
	private List<TestParam> testParam;
	@XmlElement(required = true)
	protected UserInfo userInfo;
	@XmlElement(required = true)
	private String method;
	@XmlElement(required = true)
	private TestCase.ExpectedResult expectedResult;
	private boolean passed;
	@XmlElement(required = true)
	private String message;
	@XmlAttribute(name = "id")
	private String id;
	@XmlAttribute(name = "tester")
	private String tester;
	@XmlAttribute(name = "service")
	private String service;
	@XmlAttribute(name = "status")
	private String status;

	@XmlAttribute(name = "output")
	private String output;

	private transient Date startTime;
	private transient Date endTime;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * Gets the value of the description property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the value of the description property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDescription(String value) {
		this.description = value;
	}

	/**
	 * Gets the value of the testData property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTestData() {
		return testData;
	}

	/**
	 * Sets the value of the testData property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTestData(String value) {
		this.testData = value;
	}

	/**
	 * Gets the value of the testParam property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the testParam property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getTestParam().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link TestParam
	 * }
	 * 
	 * 
	 */
	public List<TestParam> getTestParam() {
		if (testParam == null) {
			testParam = new ArrayList<TestParam>();
		}
		return this.testParam;
	}

	public void setTestParam(List<TestParam> value) {
		this.testParam = value;
	}

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	/**
	 * Gets the value of the method property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMethod() {
		return method;
	}

	/**
	 * Sets the value of the method property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMethod(String value) {
		this.method = value;
	}

	/**
	 * Gets the value of the expectedResult property.
	 * 
	 * @return possible object is {@link TestCase.ExpectedResult }
	 * 
	 */
	public TestCase.ExpectedResult getExpectedResult() {
		return expectedResult;
	}

	/**
	 * Sets the value of the expectedResult property.
	 * 
	 * @param value
	 *            allowed object is {@link TestCase.ExpectedResult }
	 * 
	 */
	public void setExpectedResult(TestCase.ExpectedResult value) {
		this.expectedResult = value;
	}

	/**
	 * Gets the value of the passed property.
	 * 
	 */
	public boolean isPassed() {
		return passed;
	}

	/**
	 * Sets the value of the passed property.
	 * 
	 */
	public void setPassed(boolean value) {
		this.passed = value;
	}

	/**
	 * Gets the value of the message property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Sets the value of the message property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMessage(String value) {
		this.message = value;
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

	/**
	 * Gets the value of the tester property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTester() {
		return tester;
	}

	/**
	 * Sets the value of the tester property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTester(String value) {
		this.tester = value;
	}

	/**
	 * Gets the value of the service property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getService() {
		return service;
	}

	/**
	 * Sets the value of the service property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setService(String value) {
		this.service = value;
	}

	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
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

	@Override
	public Object clone() throws CloneNotSupportedException {
		try {
			TestCase clonedObject = (TestCase) super.clone();

			if (this.testParam != null) {
				List<TestParam> testParams = new ArrayList<TestParam>();

				for (TestParam testParam : this.testParam) {
					testParams.add((TestParam) testParam.clone());
				}

				clonedObject.setTestParam(testParams);
			}
			if (this.expectedResult != null) {
				clonedObject.setExpectedResult((ExpectedResult) this.expectedResult.clone());
			}

			return clonedObject;
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained
	 * within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="expectation" type="{http://www.directv.com/pges-testsuite}expectation" maxOccurs="unbounded"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "httpCode", "expectation" })
	public static class ExpectedResult implements Serializable, Cloneable {

		private final static long serialVersionUID = 1L;
		private int httpCode;
		@XmlElement(required = true)
		private List<Expectation> expectation;

		/**
		 * Gets the value of the status property.
		 * 
		 */
		public int getHttpCode() {
			return httpCode;
		}

		/**
		 * Sets the value of the status property.
		 * 
		 */
		public void setHttpCode(int value) {
			this.httpCode = value;
		}

		/**
		 * Gets the value of the expectation property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the expectation property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getExpectation().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link Expectation }
		 * 
		 * 
		 */
		public List<Expectation> getExpectation() {
			if (expectation == null) {
				expectation = new ArrayList<Expectation>();
			}
			return this.expectation;
		}

		public void setExpectation(List<Expectation> value) {
			this.expectation = value;
		}

		@Override
		public Object clone() throws CloneNotSupportedException {
			try {
				ExpectedResult clonedObject = (ExpectedResult) super.clone();

				if (this.expectation != null) {
					List<Expectation> expectations = new ArrayList<Expectation>();

					for (Expectation expectation : this.expectation) {
						expectations.add((Expectation) expectation.clone());
					}

					clonedObject.setExpectation(expectations);
				}

				return clonedObject;
			} catch (CloneNotSupportedException e) {
				return null;
			}
		}

	}

}
