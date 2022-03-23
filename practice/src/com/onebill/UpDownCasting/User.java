package com.onebill.UpDownCasting;

public class User {
	
	String name;
	long num;
	
	public User(String name, long num) {
		this.name = name;
		this.num = num;
	}

	public void chat() {
		System.out.println(name+" chatting");
	}
	
	public void videocall() {
		System.out.println(name+" calling the number "+num);
	}
	
	public void share() {
		System.out.println(name+" sharing");
	}
}
