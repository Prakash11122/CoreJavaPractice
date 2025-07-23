package com.it.prauge;

public class Circle extends Shape{
	
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	double calculateArea() {
		
		return Math.PI * radius * radius;
	}

}
