package com.spring;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalMethods {
	

	@ExceptionHandler(value=NullPointerException.class)
	public String handle(Exception e){
		System.out.println("inside handle");
		
		return "NullPointer";
	}
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=Exception.class)
	public String handle1(Exception e){
		
		return "Exception";
	}
	

}
