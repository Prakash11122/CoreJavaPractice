package com.it.pradhan.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterEvenNumbers {

	public static void main(String[] args) {
		List<Integer> collect = Stream.of(20, 12, 21, 50, 87, 99)
				.filter(n -> n % 2 == 0)
				.collect(Collectors.toList());
		System.out.println("Even Numbers: "+collect);

	}

}
