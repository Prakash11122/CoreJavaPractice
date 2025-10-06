package com.java8;

import java.util.Arrays;

public class DuplicateCharacterEx1 {

	public static void main(String[] args) {
		
		Arrays.stream(new Integer[] {1, 2, 2, 3, 3, 3, 4})
        .distinct()
        .forEach(System.out::print);

	}

}
