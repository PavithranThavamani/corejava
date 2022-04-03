package com.oneline.demos.CollectionsDemo;

public class Laptop {
	
	int price;
	int ram;
	boolean touch;

	public Laptop(int i, int j, boolean b) {
		price = i;
		ram = j;
		touch = b;
	}

	@Override
	public String toString() {
		return "Laptop [price=" + price + ", ram=" + ram + ", touch=" + touch + "]";
	}


	

	

	
}
