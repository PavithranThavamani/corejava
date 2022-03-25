package com.online.customExceptionBank;

public class Bank {

	private int balance;

	public int getBalance() {
		return balance;
	}
	
	public void deposit(int amount) {
		balance += amount;
		System.out.println("The balance after the deposit is "+balance);
	}
	
	public void withdraw(int amount) {
		if(amount <= balance && amount>0) {
			balance -= amount;
			System.out.println("The balance left is "+balance);
		} else {
			try {
				throw new InsufficientBalanceException("Insufficient Balance");
			}catch(InsufficientBalanceException e) {
				System.out.println(e.getMsg());
			}
		}
	}
}
