package com.onebill.assignment5;

public class BankB extends Bank {
	
	String money;
	BankB(String str) {
		money = str;
	}

	public void getBalance() {
		System.out.println(money+" dollars deposited...");
	}
}
