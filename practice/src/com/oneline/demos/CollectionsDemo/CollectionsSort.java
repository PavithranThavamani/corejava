package com.oneline.demos.CollectionsDemo;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSort {

	public static void main(String[] args) {
		
		Main main = new Main();
		ArrayList al = new ArrayList();
		al.add("Green Apple");
		al.add("Orange");
		al.add("Mango");
		al.add("Goa");
//		Collections.sort(al);
		Collections.sort(al, main);
		System.out.println(al);
	}
}
