package com.onebill.AccessSpecifiers;

public class Demo2 extends Demo {

	public static void main(String[] args) {
		Demo2 demo2 = new Demo2();
		System.out.println(demo2.x);
		System.out.println(demo2.y);
		System.out.println(demo2.z);
//		System.out.println(demo2.a);
		
		demo2.add();
//		demo2.sub();
		demo2.mul();
		demo2.div();
	}
}
