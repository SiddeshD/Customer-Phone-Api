package com.spring.boot.errorresponse;

public class PhoneNumberNotFoundException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1391898103479246333L;

	public PhoneNumberNotFoundException(String exception) {
	    super(exception);
	  }

}
