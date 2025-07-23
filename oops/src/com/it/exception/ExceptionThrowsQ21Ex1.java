package com.it.exception;

public class ExceptionThrowsQ21Ex1 {
	
	public static void method() {
		method1();
	}
	
	public static void method1() {
		throw new ArithmeticException("Arithmatic exception from method1");
	}


	public static void main(String[] args) {
		
		try {
			method1();
		} catch (ArithmeticException e) {
			System.out.println("Exception handled");
		}
		
		
	}

}
