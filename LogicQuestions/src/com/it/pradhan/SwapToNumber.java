//2. How do you swap two numbers without using a third variable in Java?

package com.it.pradhan;

public class SwapToNumber {
	public static void main(String[] args) {
		int a=10;
		int b= 20;
		System.out.println("a is: "+ a + " b is: "+b);
		
		b = b + a;
		a = b - a;
		b = b - a;
		
		System.out.println(" After swapping a is: "+a+"and  b is:" +b);
		
	}

}
