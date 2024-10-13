package com.fullstack_backend.exception;

import com.fullstack_backend.model.User;

public class UserNotFoundException extends RuntimeException{
	public UserNotFoundException(Long id) {
		super("Could not found the user with id " + id);
	}
	public UserNotFoundException(User newUser) {
		super("loads details added successfully");
	}
	

}
