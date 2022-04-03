package com.onebill.practicequestions;

import java.util.*;

public class Frequency {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:..");
		int size = sc.nextInt();

		int a[] = new int[size];
		int b[] = new int[a.length];
		int flag = -1;
		System.out.println("Enter the elements:..");
		for(int i = 0; i < size; i++) {
			int data = sc.nextInt();
			a[i] = data;
		}
		System.out.println("Frequencies of the entered elements:..");
		for (int i = 0; i < a.length; i++) {
			int count = 1;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
					b[j] = flag;
				}
			}
			if (b[i] != flag) {

				b[i] = count;
			}
		}
		for (int i = 0; i < b.length; i++) {
			if (b[i] != flag) {

				System.out.println(a[i] +" occured "+ b[i]+" times");
			}
		}
	}

}
