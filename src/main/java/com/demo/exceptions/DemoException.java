package com.demo.exceptions;

/**
 * A custom exception notifing users something goes wrong
 * @author Nikolaos Chantzopoulos
 * @since 07-29-2018
 * @version 0.1
 *
 */
public class DemoException extends RuntimeException {

	private static final long serialVersionUID = 6653510485109699559L;

	public DemoException(String message) {
		super(message);		
	}

	
}
