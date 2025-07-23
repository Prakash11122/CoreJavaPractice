package com.it.prauge;

public class ExceptionThree {

	public static void main(String[] args) {
		System.out.println("start-1");
		try {
		System.out.println(10/0);
		}catch (ArithmeticException e) {
			System.out.println(10/0);
		}
		System.out.println("start-3");
	}

}