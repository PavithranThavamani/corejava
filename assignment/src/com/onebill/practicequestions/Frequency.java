package com.onebill.practicequestions;
import java.util.*;

public class Frequency {
	
	static void findFrequency(int a[], int size) {
		
		int b[] = new int[size];
		int count = 1;
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a.length; j++) {
				if(a[i] == a[j]) {
					count++;
				}
				b[i] = count;
				count = 0;
			}
			
		}
		for(int i = 0; i < size; i++) {
			System.out.println(a[i]+" "+b[i]);
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size..");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter the elements...");
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		Frequency.findFrequency(a, size);
		
//		void findFrequency(a, size);
	}
}
