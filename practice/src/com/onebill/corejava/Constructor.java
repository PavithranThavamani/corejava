package com.onebill.corejava;

public class Constructor {
	
	static void add() {
		int a=10; int b=20;
		int sum = a+b;
		System.out.println(sum);
	}
	 void sub() {
		int a=10; int b=20;
		int sum = a-b;
		System.out.println(sum);
	}
//	Constructor() {
////		int x = 10;
//		System.out.println("Hello");
//	}
	public static void main(String[] args) {
////		Constructor obj  = new Constructor();
//		
//		 new MethodMulti();
//		 new Constructor();
////		 MethodMulti obj = new MethodMulti();
////		 System.out.println(obj.x + obj.y);
//		 MethodMulti.Div(300, 40);
		System.out.println("HEllo");
		
add();
	Constructor obj = new Constructor();
	obj.sub();

	}
}
