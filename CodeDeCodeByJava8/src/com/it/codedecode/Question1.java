//find the duplicate element in a given integer list in java using stream functions?

package com.it.codedecode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Question1 {

	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(10, 11, 21, 22, 11, 10);
		Set<Integer> set = new HashSet<Integer>();
		asList.stream()
		.filter(x -> !set.add(x))
		.collect(Collectors.toSet())
		.forEach(x -> System.out.println(x));

	}

}
