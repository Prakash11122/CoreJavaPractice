package com.it.prauge;

public class Main {


	public static void main(String[] args) {
		Shape circle = new Circle(5.0);
		Shape rectaShape  = new Rectangle(4.0, 6.0);
		
		
		System.out.println("circle area: " + circle.calculateArea());
		System.out.println("Rectangle area: " + rectaShape.calculateArea());
		
	
}
}
