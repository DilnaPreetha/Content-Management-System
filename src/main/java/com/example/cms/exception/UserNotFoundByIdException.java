package com.example.cms.exception;

public class UserNotFoundByIdException {
	private String message;

	public UserNotFoundByIdException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "UserNotFoundByIdException [message=" + message + "]";
	}

	

}
