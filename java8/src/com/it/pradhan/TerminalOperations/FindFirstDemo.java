package com.it.pradhan.TerminalOperations;

import java.util.Optional;
import java.util.stream.Stream;

public class FindFirstDemo {

	public static void main(String[] args) {
		Optional<String> firstname = Stream.of("Alice", "Bob", "Charlie").findFirst();
		
		System.out.println(firstname.get());

	}

}
