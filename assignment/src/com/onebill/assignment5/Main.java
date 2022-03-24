package com.onebill.assignment5;

public class Main {
	
	public static void main(String[] args) {
		
		BankA bankA = new BankA();
//		bankA.getBalance("$100");
		bankA.getBalance();

		bankA.print();
		BankB bankB = new BankB("$150");
		bankB.getBalance();
		
		BankC bankC = new BankC();
		bankC.getBalance();
	}

}
