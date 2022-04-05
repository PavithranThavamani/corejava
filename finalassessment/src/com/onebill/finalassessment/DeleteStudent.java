package com.onebill.finalassessment;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class DeleteStudent {
	Scanner sc = new Scanner(System.in);
	public DeleteStudent(List<Student> list) {
		System.out.println("Enter the student Id to delete");
		int id1 = sc.nextInt();
		Iterator<Student> it = list.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			if (s.getId() == id1) {
				it.remove();
			}
		}
		System.out.println("Deleted Successfully");
		System.out.println();
		System.out.println("------------------------------");
//		Iterator<Student> e = list.iterator();
//		while (e.hasNext()) {
//			Student s = e.next();
//			System.out.println(s);
//		}
	}
}
