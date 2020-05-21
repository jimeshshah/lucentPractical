package com.lucent.Practical.exceptions;

public class CustomException extends RuntimeException{
	
	private String msg;
	
	public CustomException(String msg) {
		this.msg = msg;
	}

}
