package com.it.pradhan.IntermediateOperations;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SquareOfEachNumber {

	public static void main(String[] args) {
		List<Integer> collect = Stream.of(2,5,6,7,8,9)
				.map(num -> num*num)
				.collect(Collectors.toList());
		System.out.println(collect);
		
		
		

	}

}
