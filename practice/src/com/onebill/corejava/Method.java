package com.onebill.corejava;

public class Method {
	
	//Instance variable
	int x = 10;
	
	//Static variable
	static int y = 20;
	
	public static void main(String[] args) {
		
		//Local variable
		int z = 30;
		
		//creating an Object
		Method m = new Method();
		System.out.println(m.x);
		System.out.println(Method.y);
		System.out.println(z);
		
	}
}
