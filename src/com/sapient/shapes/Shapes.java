package com.sapient.shapes;

public class Shapes {

	private int numberOfSides;
public void calculateShapeArea(int numberOfSides,int side)
{
	this.numberOfSides=numberOfSides;
	if(numberOfSides==1)
	{
		Circle circle=new Circle(side);
		System.out.println("The Area of The Circle is "+circle.calculateArea());
	}
	else if(numberOfSides==3)
	{
		Triangle triangle= new Triangle(side);
		System.out.println("The Area of The Triangle is "+triangle.calculateArea());

	}
	else if(numberOfSides==4)
	{
	    Square square=new Square(side);
		System.out.println("The Area of The Triangle is "+square.calculateArea());

	}
	else
	{
		System.out.println("No Shapes Present");

	}
}

  public static void main(String[] args) {
	Shapes shape=new Shapes();
	shape.calculateShapeArea(3, 12);
	shape.calculateShapeArea(4, 15);
	shape.calculateShapeArea(5, 15);
	
}
}
