package com.onebill.asssignment;

public class Employee extends Member {

	String specialization;

	public Employee(String spec, String name, int age, int salary, long phoneNum, String add) {
		super(name, age, salary, phoneNum, add);
		specialization = spec;
		System.out.println("Specialization: " + spec);
		

//		System.out.println("Name: " + name);
//		System.out.println("Age: " + age);
//		System.out.println("PhoneNumber: " + phoneNum);
//		System.out.println("Address: " + add);
//		System.out.println("Specialization: " + spec);
//		System.out.println("Department: " + department);
		// TODO Auto-generated constructor stub
	}

}
