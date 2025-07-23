package com.it.exception;

public class TestQ14 {
	
	public static void main(String[] args) {
		System.out.println("Program started");
		try {
		int a =15/0;
		}catch (Exception e) {
		System.out.println("Exception Handeled..");
		}
		System.out.println("Program ended");
		
	}

}
