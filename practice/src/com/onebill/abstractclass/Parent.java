package com.onebill.abstractclass;

abstract public class Parent {
	
	int x;
	static int y;
	
	public Parent(int x) {
		this.x = x;
	}

	abstract void method1();
	
	void method2() {
		System.out.println("From abstract class...."+x);
	}
}
