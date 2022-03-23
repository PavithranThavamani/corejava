package com.onebill.assignmentAbstract;

public abstract class AbstractClass {

	AbstractClass() {
		System.out.println("This is constructor of abstract class");
	}

	public abstract void a_method();

	public void nonAbstractMethod() {
		System.out.println("This is normal method of abstract class");
	}
}
