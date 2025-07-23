package com.it.codedecode;

public class Car implements DefaultMethod{
	public void enginee() {
		System.out.println("Welcome to enginee default method");
	}
	public static void main(String[] args) {
		Car c = new Car();
		c.enginee();
	}

}
