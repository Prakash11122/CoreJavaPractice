package com.it.pradhan;

public class Car implements Vehicle {

	@Override
	public void start() {
		System.out.println("Car started........");
		
	}
	
	public static void main(String[] args) {
		Car c = new Car();
		c.start();
		c.clean();
		c.m1();
		c.m2();
		Vehicle.cleanmore();
		
	}
}
