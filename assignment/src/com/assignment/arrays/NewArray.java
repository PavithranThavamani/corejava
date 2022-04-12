package com.assignment.arrays;

import java.util.*;

public class NewArray {

	public boolean findThree(int arr[]) {
		if(arr.length >= 3) {
			for(int i = 0; i < arr.length; i++) {
				if( arr[i] == 3 && arr[i - 1] == 3 && arr[i+1] == 3) {
					return true;
				}
			}
		}else {
			System.out.println("Conditions not met");
		}
		return false;
		
	}
	public static void main(String[] args) {

		System.out.println("Enter the size: ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[];
		arr = new int[size];
		System.out.println("Enter the elements: ");
		for (int i = 0; i < size; i++) {
			int data = sc.nextInt();
			arr[i] = data;
		}
		NewArray nw = new NewArray();
		boolean result = nw.findThree(arr);
		
	}
}
