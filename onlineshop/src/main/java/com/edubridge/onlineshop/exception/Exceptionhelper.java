package com.edubridge.onlineshop.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;




@ControllerAdvice

public class Exceptionhelper extends ResponseEntityExceptionHandler{

	
@SuppressWarnings({ "unchecked", "rawtypes" })
public final ResponseEntity<Object>handleRecordnotFoundException (ProductDoesNotExist ex){
	
	ErrorResponse error = new ErrorResponse(ex.getMessage(),HttpStatus.NOT_FOUND.value());
	return new ResponseEntity(error,HttpStatus.NOT_FOUND);
		
		
		
	}
@ExceptionHandler(Exception.class)
public final ResponseEntity<Object>handleRecordNotFoundException (Exception ex){
	
	ErrorResponse error = new ErrorResponse(ex.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR.value());
	return new ResponseEntity<>(error,HttpStatus.INTERNAL_SERVER_ERROR);


}
@ExceptionHandler(CardItemsDoesNotExist.class)
public final ResponseEntity<Object>handleCardItemsDoesNotExist (CardItemsDoesNotExist ex){
	
	ErrorResponse error = new ErrorResponse(ex.getMessage(),HttpStatus.BAD_REQUEST.value());
	return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);


}





}
