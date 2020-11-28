/**
 * 
 */
package com.training.microservices.restfulwebservices.user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Matt
 *
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {

	/**
	 * @param message
	 */
	public UserNotFoundException(String message) {
		super(message);
	}
	
}
