package com.oneline.demos;

import java.util.Arrays;

public class ArraysClass {
	
	String name;

	public ArraysClass(String string) {
		name = string;
	}

	public static void main(String[] args) {
		
		int[] arr = {3, 5, 2, 7, 23, 1};
		int[] arr2 = {3, 59, 2, 7, 23, 1};
		
		
//		boolean flag = Arrays.equals(arr, arr2);
//		System.out.println(flag);
//		Arrays.sort(arr);
//		
//		for(int i : arr) {
//			System.out.println(i);
//		}
		
		String[] names = {"AudiR8", "Ferrari","Bugatti veriyon", "BMW", "Lamborgini"};
		Arrays.sort(names);
		
//		for(String s : names) {
//			System.out.println(s);
//		}
		ArraysClass arraysClass = new ArraysClass("AUDI");
		ArraysClass arraysClass2 = new ArraysClass("ROLCE ROYCE");
		ArraysClass arraysClass3 = new ArraysClass("FERRARI");
		 
		ComparatorDemo comparatorDemo = new ComparatorDemo();
		Arrays.sort(names, comparatorDemo);
		for(String s : names) {
			System.out.println(s);
		}
		ArraysClass[] ac = {arraysClass, arraysClass2, arraysClass3};
//		Arrays.sort(ac);
//		for(ArraysClass i : ac )  {
//			System.out.println(i);
//		}
		
		
		
		
	}
}
