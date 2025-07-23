package com.it.prauge;

public class Test2 {
	
	public void methodOne(int i, float f) {
		System.out.println("int-float method");
	}
	
	public void methodOne(float f, int i) {
		System.out.println("float-float method");
	}
	
	public static void main(String[] args) {
		Test2 t2 = new Test2();
		t2.methodOne(5, 5.0f);
		t2.methodOne(10.0f, 4);
		//t2.methodOne(5, 05);
	}

}
