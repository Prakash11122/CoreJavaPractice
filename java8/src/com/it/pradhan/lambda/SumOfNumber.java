package com.it.pradhan.lambda;

import java.util.function.BiConsumer;

public class SumOfNumber {

	public static void main(String[] args) {
		BiConsumer<Integer, Integer> sum = (a, b) -> System.out.println(a + b);
		sum.accept(10,20);

	}

}
