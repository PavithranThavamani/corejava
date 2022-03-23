package com.onebill.interfaceclass;

public class Casio implements Calculator {

	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}

	@Override
	public int sub(int x, int y) {
		// TODO Auto-generated method stub
		return x-y;
	}

	@Override
	public double mul(double x, double y) {
		// TODO Auto-generated method stub
		return x*y;
	}

	@Override
	public double div(double x, double y) {
		// TODO Auto-generated method stub
		return x/y;
	}

	
}
