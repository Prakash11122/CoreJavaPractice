// Sorts elements in ascending order by default.
package com.it.pradhan.IntermediateOperations;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ShortElementAscOrd {

	public static void main(String[] args) {
		List<Integer> collect = Stream.of(4,6,2,5,7,99,8,77)
				.sorted()
				.collect(Collectors.toList());
		System.out.println(collect);
		
	}

}
