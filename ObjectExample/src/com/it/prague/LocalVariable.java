package com.it.prague;

public class LocalVariable {
	
	static void display() {
		System.out.println("this is static class");
	}

	public static void main(String[] args) {
//		int x = 10;
		display();
		LocalVariable.display();
		

	}

}