package com.it.pradhan.IntermediateOperations;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SkipDemo {

	public static void main(String[] args) {
		List<Integer> collect = Stream.of(10, 20, 30, 40, 50)
				.skip(2).collect(Collectors.toList());
				System.out.println(collect);

	}

}
