package com.it.prague;

class Test{
	static void display() {
		System.out.println("Welcome");
	}
	
}

public class StaticClass {
	
	static void show() {
		System.out.println("Hellow");
	}
	public static void main(String[] args) {
		show();
		Test.display();
	}

}


