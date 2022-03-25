package com.onebill.license;

public class InsufficientAgeException extends RuntimeException {

	
private String msg;
	
	

	public InsufficientAgeException(String msg) {
		super(msg);
//		this.msg = msg;
	}



	public String getMsg() {
		return msg;
	}
}
