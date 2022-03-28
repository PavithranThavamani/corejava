package com.assignment.arrays;
import java.util.*;

public class Arrays {

	
	public static void main(String[] args) {
		
		System.out.println("Enter the size....");
		Scanner sc = new Scanner(System.in);
		int total = 0;
		int size = sc.nextInt();
				
		int arr[];
		arr = new int [size];
		System.out.println("Enter the numbers...");
		for(int i = 0; i < size; i++) {
			int sum = sc.nextInt();
			 arr[i] = sum;
			 
		}
		
		for(int i = 0; i<size; i++) {
			total += arr[i];
		}
		
		System.out.println("The total is: "+ total);
		
//		for(int i = 0; i<size; i++) {
//			System.out.println(arr[i]);
//		}
	}
}
