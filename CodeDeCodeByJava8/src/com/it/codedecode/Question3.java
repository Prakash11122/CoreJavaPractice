package com.it.codedecode;

import java.util.Arrays;
import java.util.List;

public class Question3 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(11, 11, 22, 1, 33, 22, 10, 10);
		//numbers.stream().limit(5).forEach(x -> System.out.println(x));
		numbers.stream().skip(5).forEach(x -> System.out.println(x));
		

	}

}
