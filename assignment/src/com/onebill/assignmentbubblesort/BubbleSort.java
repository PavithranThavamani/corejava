package com.onebill.assignmentbubblesort;
import java.util.*;
public class BubbleSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:");
		int size = sc.nextInt();
		int arr[];
		arr = new int[size];
		System.out.println("Enter the numbers;");
		for(int i = 0; i<size; i++) {
			int data = sc.nextInt();
			arr[i] = data;
		}
		int temp = 0;
		
	System.out.println("Sorting in descending order..");
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr.length; j++) {
				if(arr[j]>arr[i]) {
					
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
//		System.out.println("After sorting...");
		for(int i = 0; i<arr.length; i++ ) {
			System.out.println(arr[i]);
		}
		
		System.out.println("Sorting in ascending order...");
		for(int i = 0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[j]>arr[i]) {
					
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
//		System.out.println("After sorting...");
		for(int i = 0; i<arr.length; i++ ) {
			System.out.println(arr[i]);
		}
		
	
	}
}
