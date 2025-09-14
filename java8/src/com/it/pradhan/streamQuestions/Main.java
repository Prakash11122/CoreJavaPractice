package com.it.pradhan.streamQuestions;

public class Main implements Left, Right{

	@Override
	public void m1() {
		System.out.println("m1 default method overriden in impl class");
		Right.super.m1();
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.m1();
		
		Right right = new Main();
		right.m1();
	}

	

}
