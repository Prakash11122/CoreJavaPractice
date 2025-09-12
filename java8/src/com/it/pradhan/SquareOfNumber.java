package com.it.pradhan;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class SquareOfNumber {

	public static void main(String[] args) {
		List<Integer> ls = Arrays.asList(4,6,8,5,10,33,7,55,22,44);
		Function<Integer, Integer> f1 = ele -> ele*ele;
		for(Integer e:ls) {
			Integer apply = f1.apply(e);
			System.out.println(apply);
		}
		
		
		

	}

}
