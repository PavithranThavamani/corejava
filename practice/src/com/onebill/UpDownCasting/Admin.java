package com.onebill.UpDownCasting;

public class Admin extends User {
	
	public Admin(String name, long num) {
		super(name, num);
	}

	public void addUser() {
		System.out.println(name+" adding user");
	}
	
	public void removeUser() {
		System.out.println(name+" removing user");
	}
}
