package com.onebill.practicequestions;

import java.util.Scanner;

public class LeftRotate {
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {1, 2, 3, 4, 5, 6};
//		int num = 2;
		int j = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of times to rotate:");
		int num = sc.nextInt();
		for(int i = 0; i < num; i++) {
			int last = arr[0];
			for( j = 0 ; j < arr.length-1; j++) {
				arr[j] = arr[j+1];
			}
			
			arr[j] = last;
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
