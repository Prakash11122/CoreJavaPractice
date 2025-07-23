package com.it.durga;

public class StringCompare {

	public static void main(String[] args) {
		String s1 = new String("Durga");
		String s2 = new String("Durga");

		System.out.println(s1 == s2);// Reference comparision (false)
		System.out.println(s2.equals(s2));// content comparision (true)

	}

}
