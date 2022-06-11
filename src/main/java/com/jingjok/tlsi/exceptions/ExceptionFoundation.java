package com.jingjok.tlsi.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.client.HttpStatusCodeException;

@SuppressWarnings("serial")
public class ExceptionFoundation extends HttpStatusCodeException {
	
	private ExceptionResponseModel.EXCEPTION_CODES excDetails;
	private String message;
	
	public ExceptionFoundation(ExceptionResponseModel.EXCEPTION_CODES excDetails, HttpStatus status, String exc) {
		super(status);
		this.excDetails = excDetails;
		this.message = exc;
	}
	
	public ExceptionResponseModel.EXCEPTION_CODES getExceptionCode(){
		return this.excDetails;
	}
	
	public String getMessage() {
		return this.message;
	}
	

}
