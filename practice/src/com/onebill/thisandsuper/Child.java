package com.onebill.thisandsuper;

public class Child extends Parent {

	int z;
	int a;
	int b;
	int c;
	int d;
	
	public  Child(int x, int y, int z) {
		super(x, y);
		
		this.z =z;
	}
	
	public  Child(int x, int y, int z, int a, int b) {
//		super(x, y);
		this(x, y, z);
		this.a = a;
		this.b = b;
//		this.z = z;
	}
	
	public  Child(int x, int y, int a, int b, int z, int c, int d) {
//		super(x, y);
		this(x, y, z, a, b);
//		this.a = a;
		
//		this.b = b;
//		this.z = z;
		this.c = c;
		this.d = d;
	}
	
	
}
