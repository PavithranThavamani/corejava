package com.online.customExceptionBank;

public class User {

	public static void main(String[] args) {
		Bank bank = new Bank();
		System.out.println(bank.getBalance());
		bank.deposit(10000);
		bank.withdraw(5000);
		bank.withdraw(200000);
	}
}
