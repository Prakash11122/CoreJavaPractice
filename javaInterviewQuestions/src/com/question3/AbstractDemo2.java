package com.question3;

public class AbstractDemo2 extends MyAbstractClass2{

	public AbstractDemo2(int a, int b) {
		super(a, b);
		
	}
	
	public static void main(String[] args) {
		AbstractDemo2 ab = new AbstractDemo2(10, 20);
		ab.print();
	}

}
