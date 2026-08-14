package com.ws07.exception;

public class BalanceLackException extends Exception{
	public BalanceLackException(){
		super();
	}
	
	public BalanceLackException(String message){
		super(message);
	}
}
