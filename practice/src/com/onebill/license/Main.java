package com.onebill.license;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age ");
		int age = sc.nextInt();
		License li = new License();
//		li.setAge(17);
		li.checkAge(age);
	}
}

