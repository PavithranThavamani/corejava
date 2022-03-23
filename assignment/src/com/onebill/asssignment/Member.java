package com.onebill.asssignment;

public class Member {

	String name;
	int age;
	long phoneNumber;
	String address;
	int salary;
	
	public Member(String name, int age, int salary, long phoneNum, String add) {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("PhoneNumber: " + phoneNum);
		System.out.println("Address: " + add);
//		System.out.println("Specialization: " + spec);
		printSalary(salary);
	}

//	public Member(int sal) {
//		printSalary(sal);
//
//	}

	
	
	public void printSalary(int salary) {
		System.out.println("Salary: "+salary);
	}
}
