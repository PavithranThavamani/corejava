package com.onebill.exceptionhandling;

public class Main {

	public static void main(String[] args) {
		
		int b = 1;
		int c = 2;
		int res = b/c;
		int a[];
		a = new int[res];
		try {
			System.out.println(a[10]);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
