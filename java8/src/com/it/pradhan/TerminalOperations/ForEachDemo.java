package com.it.pradhan.TerminalOperations;

import java.util.stream.Stream;

public class ForEachDemo {

	public static void main(String[] args) {
		Stream.of("Alice", "Bob", "Charlie").forEach(names -> System.out.println(names));

	}

}
