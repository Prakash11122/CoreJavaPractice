package com.it.pradhan.streamQuestions;

import java.util.function.Function;

public class FunctionalInterfaceEx6 {

	public static void main(String[] args) {
		
		//Return Square of a number
		
		Function<Integer, Integer> func = num -> num*num;
		Integer apply = func.apply(11);
		System.out.println(apply);
		
		
		
		//Return Length of the string
		Function<String, Integer> lengthOfString = str -> str.length();
		System.out.println(lengthOfString.apply("Guna"));
		
		
		//Return uppercase of given String
		
		Function<String, String> uppercaseString = str -> str.toUpperCase();
		
		System.out.println(uppercaseString.apply("Guna"));
		
		
		
		//	Create Object of Student
		System.out.println("printing student grade : approach1");
		
		StudentFunctionalInterfaceEx6 s1 = new StudentFunctionalInterfaceEx6("Guna", 110);
		
		
		

	}

}
