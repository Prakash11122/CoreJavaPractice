package com.it.pradhan.lambda;

public class Car implements Vehicle{

	

	@Override
	public void start() {
		System.out.println("Car started..");
		
	}
	public static void main(String[] args) {
		Car c = new Car();
		Vehicle.clean();
		c.m1();
		c.m2();
		c.start();
	}

}
