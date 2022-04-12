package com.onebill.singleton;

public class Employee {

	static Employee e;
	private Employee() {
		
	}

	public static Employee getObject() {
		if(e == null) {
			e = new Employee();
		}
		return e;
	}
}
