package com.onebill.oops;

public class IPhone extends ParaConst {
	
	int price;
	String brand;

	public IPhone(int p, String str) {
		super(10000, "vivo");
		price = p;
		brand = str;
		System.out.println("Iphone");
	}
}
