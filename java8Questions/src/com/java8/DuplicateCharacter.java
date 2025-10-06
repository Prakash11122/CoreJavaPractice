package com.java8;

import java.util.Arrays;

public class DuplicateCharacter {
	
	public static void main(String[] args) {
		
		
		String s = "pprraakkasshh";
		
		//Arrays.stream(s.split("")).distinct().forEach(System.out::print);
		s.chars().distinct().mapToObj(x ->(char)x).forEach(System.out::print);
	}

}
