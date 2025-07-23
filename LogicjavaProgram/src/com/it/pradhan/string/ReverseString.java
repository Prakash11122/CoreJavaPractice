package com.it.pradhan.string;

public class ReverseString {

	public static void main(String[] args) {
		String str = "i love india";

		int length = str.length();

		char[] charray = str.toCharArray();

		for (int i = charray.length - 1; i >= 0; i--) {
			System.out.print(charray[i]);
		}
		
		System.out.println( );
		
		for(int i = charray.length-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
		
		System.out.println();
		
		//approch
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		
		System.out.println();
		
		StringBuilder sbuilder = new StringBuilder(str);
		System.out.println(sbuilder.reverse());

	}

}
