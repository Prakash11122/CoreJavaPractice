// Removes duplicate elements from the stream.
package com.it.pradhan.IntermediateOperations;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicateNumber {

	public static void main(String[] args) {
		List<Integer> collect = Stream.of(1,2,1,2,3,4,3,4,5,6,5,6)
				.distinct()
				.collect(Collectors.toList());
		System.out.println(collect);
		

	}

}
