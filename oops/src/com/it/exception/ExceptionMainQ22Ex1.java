package com.it.exception;

public class ExceptionMainQ22Ex1 {

	public static void main(String[] args) {
		ExceptionParentQ22Ex1 p = new ExceptionChildQ22Ex1();
		
		try {
			p.method();
		} catch (Exception e) {
			System.out.println("Exception handeled");
		}
		

	}

}
