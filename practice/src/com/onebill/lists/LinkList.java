package com.onebill.lists;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class LinkList {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(10);
		list.add(10);
		list.add("Sachin");
		list.add(23.333);
		list.add(true);
		list.add(true);
		list.add("Sachin");
		list.add('s');
//		System.out.println("=============LinkedList===========");
		//System.out.println(list);
		Object[] array = list.toArray();
		System.out.println();
		for(Object o : array)
		System.out.println(o);
		
		LinkedHashSet set2 = new LinkedHashSet(list);
		System.out.println("=========removed duplicates=========");
//		System.out.println(set2);
		
		HashSet set = new HashSet();
		set.add(10);
		set.add(20);
		set.add(10);
		set.add("udgiw");
		set.add(50);
		set.add(45);
		System.out.println("============HashSet==============");
//		System.out.println(set);
		
		
		System.out.println("============LinkedHashSet=========");
		LinkedHashSet lset = new LinkedHashSet();
		lset.add(10);
		lset.add(20);
		lset.add(10);
		lset.add(50);
		lset.add(45);
//		System.out.println(lset);
		
		TreeSet set3 = new TreeSet();
		set3.add(10);
		set3.add(20);
		set3.add(10);
		set3.add(50);
		set3.add(45);
		System.out.println("ghg"+set3);
		
		TreeSet set4 = new TreeSet(lset);
		System.out.println(set4);
		Object[] array2 = set4.toArray();
		System.out.println(array2);
		for(Object o : array2) {
			System.out.println(o);
		}
	}
}
