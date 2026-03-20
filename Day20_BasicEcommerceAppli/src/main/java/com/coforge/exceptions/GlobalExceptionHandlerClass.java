package com.coforge.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.coforge.entities.Customers;

@ControllerAdvice
public class GlobalExceptionHandlerClass {

	@ExceptionHandler(CustomerNotFoundException.class)
	public ResponseEntity<String> handleCustomerNotFoundException(CustomerNotFoundException e){
		
//		ErrorResponse errorResponse = new ErrorResponse(
//				LocalDateTime.now(), HttpStatus.NOT_FOUND.value(), "NOT_FOUND", e.getMessage());
		
		return new ResponseEntity<>("Customer not found", HttpStatus.NOT_FOUND);
	}
	
}
