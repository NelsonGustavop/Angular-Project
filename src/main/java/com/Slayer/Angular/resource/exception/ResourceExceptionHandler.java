package com.Slayer.Angular.resource.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.Slayer.Angular.services.exceptions.ObjectNotFoundException;

@ControllerAdvice
public class ResourceExceptionHandler {

	@ExceptionHandler(ObjectNotFoundException.class)
  public ResponseEntity<StandardError> ObjectNotFoundException(ObjectNotFoundException ex, HttpServletRequest request){
	  StandardError error = new StandardError(System.currentTimeMillis(), HttpStatus.NOT_FOUND.value(),
			  "object not found", "Erroe", request.getRequestURI());
	  return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
}
	@ExceptionHandler(MethodArgumentNotValidException.class)
	  public ResponseEntity<StandardError> dataIntegrityViolationException(DataIntegrityViolationException ex, HttpServletRequest request){
		  StandardError error = new StandardError(System.currentTimeMillis(), HttpStatus.BAD_REQUEST.value(),
				  "object not found", "Error ", request.getRequestURI());
		  return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
}
	@ExceptionHandler(DataIntegrityViolationException.class)
	  public ResponseEntity<StandardError> validationErrors(MethodArgumentNotValidException ex, HttpServletRequest request){
		  ValidationError errors = new ValidationError(System.currentTimeMillis(), HttpStatus.BAD_REQUEST.value(), "Error", "Field validation error",request.getRequestURI());
		  
		  for (FieldError x :ex.getBindingResult().getFieldErrors()) {
			  errors.addErrors(x.getField(), x.getDefaultMessage());
		  }
		  
		  
		  return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errors);
}
}