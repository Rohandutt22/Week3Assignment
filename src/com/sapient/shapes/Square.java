package com.sapient.shapes;

public class Square {

	private int sides;

	public Square(int sides) {
		super();
		this.sides = sides;
	}
	public int calculateArea()
	{
		return sides*sides;
	}
}
