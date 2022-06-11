package com.jingjok.tlsi.exceptions;

import java.util.Date;

import org.springframework.http.HttpStatus;

import lombok.Data;

@Data
public class ExceptionResponseModel {
	public enum EXCEPTION_CODES {
		// Searching section
		SEARCH_NOT_FOUND(1001);

		private final int codeValue;

		private EXCEPTION_CODES(int codeValue) {
			this.codeValue = codeValue;
		}

		public int getCodeValue() {
			return codeValue;
		}
	}

	private int exceptionCode;
	private EXCEPTION_CODES reason;
	private Date timeStamp;
	private String message;
	private String details;
	private HttpStatus httpStatus;

	public ExceptionResponseModel(EXCEPTION_CODES reason, Date timeStamp, String message, String details,
			HttpStatus httpStatus) {
		this.reason = reason;
		this.exceptionCode = reason.codeValue;
		this.timeStamp = timeStamp;
		this.message = message;
		this.details = details;
		this.httpStatus = httpStatus;
	}
}
