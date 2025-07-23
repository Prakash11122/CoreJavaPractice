//Reduces the elements into a single value (e.g., sum, product, etc.)
package com.it.pradhan.TerminalOperations;

import java.util.stream.Stream;

public class Reduce {

	public static void main(String[] args) {
		Integer sum = Stream.of(1, 2, 3, 4, 5).reduce(0,(a,b)->a+b);
		System.out.println(sum);

	}

}
