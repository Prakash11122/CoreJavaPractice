package com.it.durga.oops;

class A{
	protected void m1() {
		System.out.println("Welcome to my House");
	}
}

public class ProtectedExaple extends A{

	public static void main(String[] args) {
		A a = new A();
		a.m1();//fine 
		
		ProtectedExaple pe = new ProtectedExaple();
		pe.m1(); //fine
		
		A a1 = new ProtectedExaple();
		a1.m1();
		

	}

}
