package com.it.prauge;

public class Constructor {

	Constructor(double d) {
		System.out.println("double-argument constructor");
	}

	Constructor(int i) {
		this(10.5);
		System.out.println("int-argument constructor");
	}

	Constructor() {
		this(10);
		System.out.println("no-argument constructor");
	}

	public static void main(String[] args) {
		Constructor t1 = new Constructor(); // no-argument constructor/int-argument
		// constructor/double-argument constructor
		Constructor t2 = new Constructor(10);
		// int-argument constructor/double-argument constructor
		Constructor t3 = new Constructor(10.5);// double-argument constructor

	}
}