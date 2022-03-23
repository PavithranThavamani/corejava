package com.onebill.corejava;

public class EvenNumbers {
	public static void main(String[] args) {
		int x = 100;
		for(int i = 1;i<=x;i++) {
			int y = i%2;
			if(y==0) {
				System.out.println(i);
			}
		}
	}
}
