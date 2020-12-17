package com.heraizen.iplstat.service;

public class TeamAlreadyExistsException extends Exception {
	private static final long serialVersionUID = -2140796233530941955L;

	public TeamAlreadyExistsException(String message) {
		super(message);
	}
}
