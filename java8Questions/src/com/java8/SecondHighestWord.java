package com.java8;

import java.util.Arrays;
import java.util.Comparator;

//Find the word that has the second highest length

public class SecondHighestWord {

	public static void main(String[] args) {
		
		String str = "prakash a rich person in this world";
		
		String secondLength = Arrays.stream(str.split("\\s+"))
		.sorted(Comparator.comparing(String::length).reversed())
		.skip(1)
		.findFirst()
		.orElse(str);
		
		System.out.println(secondLength);
	
		
	}

}
