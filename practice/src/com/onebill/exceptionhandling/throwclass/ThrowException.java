package com.onebill.exceptionhandling.throwclass;

public class ThrowException {

	public static void main(String[] args) {
		System.out.println( "Started......");
		try {
			
			throw new ArithmeticException();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Ended...");
	}
}
