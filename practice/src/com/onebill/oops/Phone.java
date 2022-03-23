package com.onebill.oops;

public class Phone {

	int price;
	int ram;
	int camera;
	String brand;
	
	public Phone() {
		System.out.println("This is from class Phone");
	}
	
	
	public void call() {
		System.out.println("Calling....");
	}
	
	public void message(String msg) {
		System.out.println(msg);
	}
	
	public void radio() {
		System.out.println("Listening song");
	}
	
}
