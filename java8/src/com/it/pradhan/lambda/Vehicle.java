package com.it.pradhan.lambda;

public interface Vehicle {
	
	public void start();

	public default void m1() {
		System.out.println("m1");

	}

	public default void m2() {
		
		System.out.println("m2");

	}

	public static void clean() {
		System.out.println("cleaning completed...");
	}

}
