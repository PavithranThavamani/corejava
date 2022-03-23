package com.onebill.assignmentshapes;

public class Area  {

	
	public void RectangleArea(double length, double breadth) {
		System.out.println("Area of a Rectangle is: "+(length*breadth));
	}
	
	public void SquareArea(double side) {
		System.out.println("Area of a Square is: "+(side*side));
	}
	
	public void CircleArea(double radius) {
		System.out.println("Area of a Circle is: "+(3.14*(radius*radius)));
	}
}
