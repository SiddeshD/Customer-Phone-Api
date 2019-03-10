package com.spring.boot.errorresponse;

public class CustomerNotFoundException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1058873870342153963L;

	public CustomerNotFoundException(String exception) {
	    super(exception);
	  }

}
