package com.onebill.corejava;
import java.util.*;
public class AssignmentEvenOdd {
	
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Even numbers are: ");
		while(num>0) {
			if(num % 2 == 0) {
				System.out.println(num);
			}
			num--;
		}
	
	}

}
