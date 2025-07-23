package com.it.exception;

public class ExceptionThrowsQ21 {
	
	public static void method1() {
		method2();
	}
	public static void method2() {
		throw new ArithmeticException("Arithmethic exception from method2");
		
	}

	public static void main(String[] args) {
		method1();
		

	}

}
