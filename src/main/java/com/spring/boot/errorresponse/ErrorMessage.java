/**
 * 
 */
package com.spring.boot.errorresponse;

import java.util.Date;

/**
 * @author DELL
 *
 */
public class ErrorMessage {
	
	private Date date;
	private String message;
	private String details;
	
	public ErrorMessage(String message, String details, Date date) {
		super();
		this.message = message;
		this.details = details;
		this.date = date;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	

}
