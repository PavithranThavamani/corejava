package com.onebill.license;

public class License {

//	String name;
//	private int age;
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		if (age > 0) {
//			this.age = age;
//		} else {
//			System.out.println("Enter valid age");
//		}
//	}
	public void checkAge(int age) {

		if (age >= 18) {
			System.out.println("Approved...");
		} else {
//			System.out.println("Invalid");
			try {
				throw new InsufficientAgeException("Invalid age");
			} catch (InsufficientAgeException e) {
				e.printStackTrace();
//				System.out.println(e.getMsg());
				System.out.println(e.getMessage());
			}
		}

	}
}
