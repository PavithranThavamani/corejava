package com.onebill.corejava;

public class MethodMulti {
	
	MethodMulti() {
		int d = 10;
		System.out.println("DGY");
	}
	static int g = 20;

	int x = 40;
	int y = 90;
	
	static void Div(int a, int b) {
		System.out.println(a/b);
	}
	
	static void Div(int a, int b, int c) {
		System.out.println(a/b/c);
	}
	
	static void Div(int a, double b) {
		int z = 56;
		System.out.println(a/b);
	}
	
	static void Div(float a, int b, double c) {
		System.out.println(a/b/c);
	}

	public static void main(String[] args) {

		
	Div(10, 5);
	System.out.println(g);
		MethodMulti.Div(10, 5, 6);
		MethodMulti.Div(10, 5.8);
		MethodMulti.Div(10.7f, 5,  5.7);
		new MethodMulti();
		
	}
}
