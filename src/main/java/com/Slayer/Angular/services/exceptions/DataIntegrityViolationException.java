package com.Slayer.Angular.services.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.Slayer.Angular.resource.exception.StandardError;

public class DataIntegrityViolationException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public DataIntegrityViolationException(String message, Throwable cause) {
		super(message, cause);

	}

	public DataIntegrityViolationException(String message) {
		super(message);

	}
	@ExceptionHandler(DataIntegrityViolationException.class)
	  public ResponseEntity<StandardError> dataIntegrityViolationException(DataIntegrityViolationException ex, HttpServletRequest request){
		  StandardError error = new StandardError(System.currentTimeMillis(), HttpStatus.BAD_REQUEST.value(),
				  "violação de dados", "Field Validation error", request.getRequestURI());
		  return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
	}
	
}
