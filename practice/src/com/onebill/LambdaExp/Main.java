package com.onebill.LambdaExp;

public class Main implements InterfaceDemo{

	
	public static void main(String[] args) {
	
		InterfaceDemo main = new Main();
		main.test();
		main.test2();
		InterfaceDemo.test3();
		
		InterfaceDemo id = () -> {
			System.out.println("From InterfaceDemo");
		};
		id.test();
		
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}
	
	

}
