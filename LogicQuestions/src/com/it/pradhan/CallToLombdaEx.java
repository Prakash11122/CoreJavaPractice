package com.it.pradhan;

public class CallToLombdaEx {
	
	interface MyInterfaceFirst{
		public void m1();
	}
	
	public static void main(String[] args) {
		
		MyInterfaceFirst mif = () -> System.out.println("Calling to interface existing method m1.....");
		mif.m1();
		
	}

}
