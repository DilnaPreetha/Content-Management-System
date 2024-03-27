package com.example.cms.exception;

public class UserAlreadyExistByEmailException extends RuntimeException{
	private String message;

	public UserAlreadyExistByEmailException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
