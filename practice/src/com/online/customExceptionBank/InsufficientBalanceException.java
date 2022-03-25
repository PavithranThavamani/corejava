package com.online.customExceptionBank;

public class InsufficientBalanceException extends RuntimeException {

	private String msg;
	
	

	public InsufficientBalanceException(String msg) {
		
		this.msg = msg;
	}



	public String getMsg() {
		return msg;
	}


	
}
