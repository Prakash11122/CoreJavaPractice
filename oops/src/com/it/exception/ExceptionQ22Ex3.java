package com.it.exception;

public class ExceptionQ22Ex3 {
	
	public static int method1() {
		
		try {
			//throw new ArithmeticException();
			return 1;
		} catch (Exception e) {
			return 2;
		}finally {
			return 3;
		}
		
	}
	
	public static void main(String[] args) {
		int method1 = method1();
		System.out.println(method1);
	}

}
