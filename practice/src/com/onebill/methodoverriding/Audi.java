package com.onebill.methodoverriding;

public class Audi extends Car {

	@Override
	public void drive() {
		System.out.println("Drive comfort...");
	}
}
