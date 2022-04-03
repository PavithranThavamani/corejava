package com.oneline.demos.CollectionsDemo;


import java.util.ArrayList;
import java.util.Collections;

public class MainDemo {

	public static void main(String[] args) {

		Laptop dell = new Laptop(10000, 4, true);
		Laptop hp = new Laptop(20000, 8, true);
		Laptop lenovo = new Laptop(30000, 16, false);

		ArrayList list = new ArrayList();
		list.add(lenovo);
		list.add(dell);
		list.add(hp);
		
		ComparatorDemo demo = new ComparatorDemo();
		Collections.sort(list, demo);
//		Collections.sort(list);

		System.out.println("After sort");
		System.out.println(list);

	}

	
}
