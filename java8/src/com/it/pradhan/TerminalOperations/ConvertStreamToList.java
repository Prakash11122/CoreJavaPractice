package com.it.pradhan.TerminalOperations;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertStreamToList {

	public static void main(String[] args) {
		List<String> collect = Stream.of("Alice", "Bob", "Charlie").collect(Collectors.toList());
		System.out.println(collect);

	}

}
