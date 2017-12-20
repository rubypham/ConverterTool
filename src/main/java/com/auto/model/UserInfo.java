package com.auto.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userInfo", propOrder = { "userInfoParam","siteId","siteUserId" ,"password","signature"})
public class UserInfo implements Serializable {

	private final static long serialVersionUID = 1L;

	protected List<TestParam> userInfoParam;

	@XmlAttribute(name = "siteId")
	protected String siteId;
	@XmlAttribute(name = "siteUserId")
	protected String siteUserId;
	@XmlAttribute(name = "password")
	protected String password;
	@XmlAttribute(name = "signature")
	protected String signature;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSiteUserId() {
		return siteUserId;
	}

	public void setSiteUserId(String siteUserId) {
		this.siteUserId = siteUserId;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getSiteId() {
		return siteId;
	}

	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}

	public List<TestParam> getUserInfoParam() {
		if (userInfoParam == null) {
			userInfoParam = new ArrayList<>();
		}
		return userInfoParam;
	}

	public void setUserInfoParam(List<TestParam> userInfoParam) {
		this.userInfoParam = userInfoParam;
	}

}
