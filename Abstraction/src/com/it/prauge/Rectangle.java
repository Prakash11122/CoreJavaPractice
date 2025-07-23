package com.it.prauge;

public class Rectangle extends Shape{
	
	private double lenght;
	private double width;
	
	public Rectangle(double lenght, double width) {
		super();
		this.lenght = lenght;
		this.width = width;
	}

	@Override
	double calculateArea() {
		
		return lenght * width;
	}

}
