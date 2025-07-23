package com.it.codedecode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Q5ReverseList {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("mars", "amiva", "pluto", "domain", "tesla");
		List<String> collect = list.stream()
				.sorted(Collections
				.reverseOrder())
				.collect(Collectors.toList());
		
		System.out.println(collect);

	}

}
