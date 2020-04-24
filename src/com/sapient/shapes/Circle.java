package com.sapient.shapes;

public class Circle {

	private int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	public double calculateArea()
	{
		return 3.14*radius*radius;
	}
}
