/**
 * 
 */
package com.spring.boot.service;

/**
 * @author DELL
 *
 */
public class Phone {

	private long phoneId;
	private long phoneNumber;
	private String activeFlag;
	
	public Phone(long phoneId, long phoneNumber, String activeFlag) {
		this.phoneId = phoneId;
		this.phoneNumber = phoneNumber;
		this.activeFlag = activeFlag;
	}

	public long getPhoneId() {
		return phoneId;
	}
	public void setPhoneId(long phoneId) {
		this.phoneId = phoneId;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumebr) {
		this.phoneNumber = phoneNumebr;
	}
	public String getActiveFlag() {
		return activeFlag;
	}
	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}
	
}
