package com.it.pradhan.methodReference;

interface MyInterface {
	public void m1();
}

public class MethoRef {

	public static void m2() {
		System.out.println("This is m2 method");

	}

	public static void main(String[] args) {
	MyInterface mi=	MethoRef::m2;
	mi.m1();

	}

}
