package com.ws07.exception;

public class UserAccountNotFoundException extends Exception{

	public UserAccountNotFoundException(){
		super();
	}
	
	public UserAccountNotFoundException(String message){
		super(message);
	}
}