package com.onebill.methodoverriding;

public class Jaguar extends Car {

	@Override
	public void brake() {
		System.out.println("Brakes are strong...");
	}
}
