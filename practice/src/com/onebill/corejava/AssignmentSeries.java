package com.onebill.corejava;
import java.util.*;

public class AssignmentSeries {
	public static void main(String[] args) {
		System.out.print("Enter the value of a: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.print("Enter the value of b: ");
		Scanner sc1 = new Scanner(System.in);
		int b = sc1.nextInt();
		System.out.print("Enter the Number: ");
		Scanner sc2 = new Scanner(System.in);
		int num = sc2.nextInt();
		System.out.println("The result is: ");
		for(int i=0; i<num; i++) {
			int res =0;
			for(int j = 0; j<=i; j++) {
				res = res + ((int)Math.pow(2, j) * b);
//				System.out.println(2^j);
//				System.out.println(res);
			}
			int total = a + res;
			System.out.print(total);
			if(i!=num-1)
			System.out.print(",");
			res = 0;
		}
	}
}
