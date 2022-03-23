package com.onebill.methodoverriding;

public class Owner {

	public static void main(String[] args) {
		
		Car car = new Car();
		car.brake();
		car.drive();
		car.honk();
		
		System.out.println("______________");
		Jaguar jaguar = new Jaguar();
		jaguar.brake();
		
		System.out.println("_______________");
		Audi audi = new Audi();
		audi.drive();
	}
}

