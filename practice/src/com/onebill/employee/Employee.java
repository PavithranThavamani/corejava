package com.onebill.employee;

public class Employee implements Comparable<Employee> {

	String name;
	String designation;
	int id;
	double salary;

	public Employee(String name, String designation, int id, double salary) {
		super();
		this.name = name;
		this.designation = designation;
		this.id = id;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", designation=" + designation + ", id=" + id + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee o) {
		return this.id-o.id;
	}
	
	
	
	
	
	

}
