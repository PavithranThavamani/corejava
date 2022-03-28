package com.assignment.arrays;

import java.util.*;

public class Fibonacci {

	public void doFibonacci(int size) {
		int sum = 0;
		int a = 0;
		int b = 1;
		System.out.println("The Fibonacci series for given number is: ");
		System.out.print(a + "," + b + ",");

		for (int i = 2; i < size; i++) {
			sum = a + b;
			a = b;
			b = sum;

			System.out.print(sum + ",");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number...");
		int size = sc.nextInt();
		Fibonacci fibo = new Fibonacci();
		fibo.doFibonacci(size);

	}
}
