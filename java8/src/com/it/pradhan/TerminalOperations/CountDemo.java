package com.it.pradhan.TerminalOperations;

import java.util.stream.Stream;

public class CountDemo {

	public static void main(String[] args) {
		long count = Stream.of("Apple", "Banana", "Cherry").count();
		System.out.println(count);

	}

}
