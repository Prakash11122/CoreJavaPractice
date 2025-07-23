//Write a lambda expression to calculate the sum of two integers.

package com.it.pradhan.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class Sum {

	public static void main(String[] args) {

		System.out.println("sum of 2 number is:");

		BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;
		
		Integer misana = sum.apply(11, 11);
		System.out.println(misana);
		//System.out.println(sum.apply(11, 11));

//2.Create a lambda to check if a number is even or odd

		Predicate<Integer> isEven = num -> num % 2 == 0;
		System.out.println(isEven.test(10));
		System.out.println(isEven.test(11));

//Write a lambda to calculate the square of a number.

		BiFunction<Integer, Integer, Integer> square = (a, b) -> a * b;
		System.out.println(square.apply(11, 11));

//Create a lambda to convert a string to uppercase.

		Function<String, String> upperCase = str -> str.toUpperCase();

		String str1 = "i love my self";
		String result = upperCase.apply(str1);

		System.out.println(str1);
		System.out.println(result);

//Write a lambda to concatenate two strings.

        BiFunction<String, String, String> concatenate = (strone, strtwo) -> strone + strtwo;
        
        
        String string1 = "prakash";
        String string2 = "pradhan";
        String concat = concatenate.apply(string1, string2);
        
        
        System.out.println("String 1: " + string1);
        System.out.println("String 2: " + string2);
        System.out.println("Concatenated String: " + concat);

	}

}
