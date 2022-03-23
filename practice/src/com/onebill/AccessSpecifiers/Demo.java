package com.onebill.AccessSpecifiers;

public class Demo {

	int x = 10;
	public int y = 20;
	protected int z = 30;
	private int a = 40;
	
	public void add() {
		System.out.println("Public..");
	}
	
	private void sub() {
		System.out.println("Private...");
	}
	
	protected void mul() {
		System.out.println("Protected..");
	}
	
	void div() {
		System.out.println("Default..");
	}
	
	public static void main(String[] args) {
		Demo demo = new Demo();
		System.out.println(demo.x);
		System.out.println(demo.y);
		System.out.println(demo.z);
		System.out.println(demo.a);
	}
}
