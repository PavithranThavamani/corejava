package com.onebill.singleton;

public class Singleton {

	public static void main(String[] args) {
		
		Employee object = Employee.getObject();
		System.out.println(object);
		Employee object2 = Employee.getObject();
		System.out.println(object2);
	}
}
