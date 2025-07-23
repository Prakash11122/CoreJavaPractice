package com.it.pradhan.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterNameWithFirstChar {

	public static void main(String[] args) {
		List<String> collect = Stream.of("Alice", "Bob", "Charlie", "David", "Alex")
		.filter(name -> name.startsWith("A"))
		.collect(Collectors.toList());
		System.out.println(collect);

	}

}
