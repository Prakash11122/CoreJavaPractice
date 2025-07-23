package com.it.bealdung;

public class ExampleEquelMethod {

	public static void main(String[] args) {
		String string1 = "using equals method";
		
		String string2 = "using equals method";
		        
		String string3 = "using EQUALS method";
		
		String string4 = new String("using equals method");
		
		System.out.println(string1.equals(string2));
		
		System.out.println(string1.equals(string4));
		
		System.out.println(string1.equals(string3));
		
		
		
		
		
	}

}
