package com.onebill.corejava;
import java.util.*;
public class AssignmentTables {

	public static void main(String[] args) {
		System.out.println("Enter the Number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int res = 0;
		System.out.println("The Table for number "+num+" is: ");
		for(int i=1; i<=10; i++) {
			
			System.out.println(num+" * "+i+" = "+(res = i * num));
		}
	}
}
