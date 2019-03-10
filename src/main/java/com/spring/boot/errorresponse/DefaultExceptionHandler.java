/**
 * 
 */
package com.spring.boot.errorresponse;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * @author DELL
 *
 */
public class DefaultExceptionHandler extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler()
	  public final ResponseEntity<ErrorMessage> handleCustomerNotFoundException(Exception ex, WebRequest request) {
		ErrorMessage errorMessage = new ErrorMessage(request.getDescription(false), ex.getMessage(),
	        new Date());
	    return new ResponseEntity<>(errorMessage, HttpStatus.NOT_FOUND);
	  } 

}
