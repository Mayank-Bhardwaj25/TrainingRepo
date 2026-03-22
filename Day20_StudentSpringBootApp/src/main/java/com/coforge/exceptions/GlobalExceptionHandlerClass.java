package com.coforge.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandlerClass {

	@ExceptionHandler(StudentNotFoundException.class)
	public ResponseEntity<String> handleCustomerNotFoundException(StudentNotFoundException e){
		
//		ErrorResponse errorResponse = new ErrorResponse(
//				LocalDateTime.now(), HttpStatus.NOT_FOUND.value(), "NOT_FOUND", e.getMessage());
		
		return new ResponseEntity<>("Student not found", HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(InvalidDateFormatException.class)
	public ResponseEntity<String> handleInvalidDateFormatException(InvalidDateFormatException e) {
		
		return new ResponseEntity<>("Invalid Date Format", HttpStatus.BAD_REQUEST);
	}
	
}
