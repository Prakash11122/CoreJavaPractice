package com.it.prauge;

public class Test1 {
	
	public void methodOne(String  s) {
		System.out.println("String version");
	}
	
	public void methodOne(StringBuffer s) {
		System.out.println("StringBuffer version");
	}
	
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.methodOne("prakash");
		t1.methodOne(new StringBuffer("sai"));
		//t1.methodOne(null);
	}

}
