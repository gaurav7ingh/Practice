package com.goodroots.exception;

import java.time.LocalDateTime;

public class MyError {
	
	private LocalDateTime timestamp;
	private String message;
	private String path;
	
	public MyError(LocalDateTime timestamp,String message, String path) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.path = path;
	}
	
	public MyError() {
		
	}
}
