package com.it.pradhan;

public interface Vehicle {
	
	public void start();

	public default void m1() {
		System.out.println("m1");

	}

	public default void m2() {
		System.out.println("m1");

	}

	public default void clean() {
		System.out.println("cleaning completed...default");
	}
	
	public static void cleanmore() {
		System.out.println("cleaning completed...static");
	}

}
