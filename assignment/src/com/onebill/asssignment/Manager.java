package com.onebill.asssignment;

public class Manager extends Member {

	String department;
	
//	public Manager(int salary) {
//		super(salary);
//	}
	
	public Manager(String dep, String name, int age, int salary, long phoneNum, String add ) {
		super( name, age, salary, phoneNum, add);
		department = dep;
		System.out.println("Department: " + dep);
		
//		System.out.println("Name: "+name);
//		System.out.println("Age: "+age);
//		System.out.println("PhoneNumber: "+phoneNum);
//		System.out.println("Address: "+add);
//		
////		System.out.println("Specialization: "+specialization);
//		System.out.println("Department: "+dep);
		// TODO Auto-generated constructor stub
	}

//	public Manager(int salary) {
//		super(salary);
//		// TODO Auto-generated constructor stub
//	}
	
//	@Override
//	public void printSalary(int salary) {
//		System.out.println("Salary: "+salary);
//	}
}
