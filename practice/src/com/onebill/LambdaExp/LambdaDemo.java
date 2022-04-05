package com.onebill.LambdaExp;

public class LambdaDemo {

	public static void main(String[] args) {

		InterfaceDemo id = (int num1, int num2) -> num1+num2;
		
		int res = id.add(500, 10);
		System.out.println(res);
		id.test2();
		InterfaceDemo.test3();
		
//		Main main = new Main();
//		main.test();
//		main.test2();
//		InterfaceDemo.test3();
	}
}
