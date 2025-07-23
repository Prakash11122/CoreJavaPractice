package com.it.exception;

public class ExceptionThrowsQ21Ex4 {
	
	public static void method() {
		int a = 10/0;
		
	}

	public static void main(String[] args) {
		try {
			method();
		} catch (Exception e) {
			System.out.println("Exception handled");
		}
		
	}

}
