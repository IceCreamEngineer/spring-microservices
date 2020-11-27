/**
 * 
 */
package com.training.microservices.restfulwebservices.helloworld;

/**
 * @author Matt
 *
 */
public class HelloWorldBean {
	
	private String message;

	public HelloWorldBean(String message) {
		this.message = message;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + "]";
	}
	
}
