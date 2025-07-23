package com.it.exception;

public class ExceptionThrowsQ21Ex3 {
	
	public static void method() throws ArithmeticException{
		int a = 10/0;
	}

	public static void main(String[] args) {
		try {
			method();
		} catch (Exception e) {
			System.out.println("Exception handeled");
		}
	}

}
