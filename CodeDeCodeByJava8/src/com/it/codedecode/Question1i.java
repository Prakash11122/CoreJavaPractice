//find the duplicate element in a given integer list in java using stream functions?
package com.it.codedecode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Question1i {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(11, 11, 22, 1, 33, 22, 10, 10);
		Set<Integer> collect = numbers.stream()
		.filter(i -> Collections
		.frequency(numbers, i) > 1)
		.collect(Collectors.toSet());
		
		
		System.out.println("Duplicate elements: " +collect);

	}

}
