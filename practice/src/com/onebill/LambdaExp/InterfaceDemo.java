package com.onebill.LambdaExp;

@FunctionalInterface
public interface InterfaceDemo {

	public abstract int add(int a, int b);
	
	default void test2() {
		System.out.println("Default Method");
	}
	
	static void test3() {
		System.out.println("Static Method");
	}
}
