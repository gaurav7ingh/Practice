package com.goodroots.exception;

import java.net.http.HttpRequest;
import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobleException {
	
	@ExceptionHandler(StudentException.class)
	public ResponseEntity<MyError> studentExcetpionHandler(StudentException exception, HttpRequest req){
		MyError error = new MyError(LocalDateTime.now(), exception.getMessage(),req.uri().toString());
		return new ResponseEntity<MyError>(error,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(AdminException.class)
	public ResponseEntity<MyError> adminExcetpionHandler(AdminException exception, HttpRequest req){
		MyError error = new MyError(LocalDateTime.now(), exception.getMessage(),req.uri().toString());
		return new ResponseEntity<MyError>(error,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<MyError> NoHandlerFoundExceptionHandler(NoHandlerFoundException exception, HttpRequest req){
		MyError error = new MyError(LocalDateTime.now(), exception.getMessage(),req.uri().toString());
		return new ResponseEntity<MyError>(error,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<MyError> methodExceptionHandler(MethodArgumentNotValidException exception, HttpRequest req){
		MyError error = new MyError(LocalDateTime.now(), exception.getMessage(),req.uri().toString());
		return new ResponseEntity<MyError>(error,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyError> exceptionHandler(Exception exception, HttpRequest req){
		MyError error = new MyError(LocalDateTime.now(), exception.getMessage(),req.uri().toString());
		return new ResponseEntity<MyError>(error,HttpStatus.BAD_REQUEST);
	}
	
	
}
