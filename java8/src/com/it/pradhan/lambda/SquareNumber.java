//1. Write a lambda to calculate the square of a number.

package com.it.pradhan.lambda;

import java.util.function.Function;

public class SquareNumber {

	public static void main(String[] args) {
		
		Function<Integer, Integer>	 Square = number -> number* number;
		
		Integer apply = Square.apply(5);
		System.out.println(apply);

	}

}
