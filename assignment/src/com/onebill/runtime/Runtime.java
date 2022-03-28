package com.onebill.runtime;

import java.util.Scanner;

public class Runtime {
	public static void main(String[] args) {
		int a, b;
		RuntimeThrows runtimeThrows = new RuntimeThrows();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Two Numbers :");
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
		double c;
		try {
			c = runtimeThrows.div(a, b);
			System.out.println(c);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Enter the value > 0");
		}

	}
}
