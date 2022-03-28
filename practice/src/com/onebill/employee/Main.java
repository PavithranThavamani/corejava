package com.onebill.employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
//import java.util.Iterator;

public class Main  {

	public static void main(String[] args) {
		
		Employee pavithran = new Employee("Pavithran", "Trainee", 1, 30000);
		Employee mukil = new Employee("Mukilan", "Trainee", 2, 30000);
		Employee rajan = new Employee("Rajan", "Trainee", 3, 30000);
		
		ArrayList<Employee> list = new ArrayList<>();
		list.add(pavithran);
		list.add(rajan);
		list.add(mukil);
		
//		for (Employee employee : list) {
//			System.out.println((employee));
//		}
//		
//		for(int i = 0; i < list.size(); i++ ) {
//			System.out.println(list.get(i));
//		}
		
		Collections.sort(list);
		
//		rajan.compareTo(mukil);
		
		Iterator<Employee> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		 
		
	}

	
	
	
}
