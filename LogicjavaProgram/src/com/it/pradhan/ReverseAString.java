package com.it.pradhan;

public class ReverseAString {

	public static void main(String[] args) {

		String str = "i love java logical programming";

		int length = str.length();

		// approach-1
		char[] charArray = str.toCharArray();
		for (int i = charArray.length - 1; i >= 0; i-- ) {
			System.out.print(charArray[i]);
		}

		System.out.println();

		// approach-2
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}

		System.out.println();
		// approach-3
		StringBuffer sb = new StringBuffer(str);
		System.out.print(sb.reverse());

		System.out.println();
		// approach-4
		StringBuilder SB = new StringBuilder(str);
		System.out.println(SB.reverse());

	}

}
