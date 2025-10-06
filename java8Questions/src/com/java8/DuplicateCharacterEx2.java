package com.java8;

import java.util.Arrays;

public class DuplicateCharacterEx2 {

	public static void main(String[] args) {
		
		Arrays.stream(new String[] {"a", "b", "a", "c"}).distinct().forEach(System.out::print);

	}

}
