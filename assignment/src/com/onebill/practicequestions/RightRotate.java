package com.onebill.practicequestions;

public class RightRotate {

	public static void main(String[] args) {

		int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		int num = 4;
		for (int i = 0; i < num; i++) {
			int last = arr[arr.length - 1];
			for (int j = arr.length-1; j > 0; j--) {
				arr[j] = arr[j-1];
			}
			arr[0] = last;

		}
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
