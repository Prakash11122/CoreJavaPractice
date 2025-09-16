package com.it.pradhan.streamQuestions;

import java.util.function.Function;

public class FunctionChanningEx7 {

	public static void main(String[] args) {
	
		Function<Integer, Integer> addTwo = y -> y+2;
		Function<Integer, Integer> mulByThree = y -> y*3;
		
		
		//chain the function using "andThen"
		
		Function<Integer, Integer> addTwoMulByThre = addTwo.andThen(mulByThree);
		
		//use the chanined function
		
		Integer apply = addTwoMulByThre.apply(11);
		System.out.println(apply);
		
		

	}

}
