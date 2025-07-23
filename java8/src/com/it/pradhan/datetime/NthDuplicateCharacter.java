package com.it.pradhan.datetime;

import java.util.LinkedHashMap;
import java.util.Map;

public class NthDuplicateCharacter {

	public static char getNthDuplicateChar(String str, int n) {
		Map<Character, Integer> charCount = new LinkedHashMap<>();
		int duplicateCount = 0;

		for (char ch : str.toCharArray()) {
			charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);

			// If the character appears more than once, it's a duplicate
			if (charCount.get(ch) == 2) {
				duplicateCount++;
				if (duplicateCount == n) {
					return ch; // Return the nth duplicate character
				}
			}
		}
		return '\0'; // Return null character if nth duplicate is not found
	}

	public static void main(String[] args) {
		String str = "prakashpradhan";
		int n = 3; // Change this value to get different nth duplicate characters
		char result = getNthDuplicateChar(str, n);

		System.out.println(result);
	}

}
