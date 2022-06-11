package com.jingjok.tlsi.exceptions;

import org.springframework.http.HttpStatus;

import lombok.Data;

@Data
public class HttpResponseModel {
	private int responseCode;
	private HttpStatus httpStatus;
	private String details;
	private String msg;
}
