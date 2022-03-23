package com.onebill.encapsulation;

public class Employee {

	private String name = "Me";
	private int age;
	private String designation = "devoloper";
	private int salary = 200000;
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getDesignation() {
		return designation;
	}
	public int getSalary() {
		return salary;
	}
	public void setAge(int age) {
//		this.age = age;

		
		if(age>0) {
			this.age = age;
			System.out.println(age);
		}else {
			System.out.println("Invalid");
//			return "You Idiot";
//			return 0;
		}
	}
}
	
	

