
//Write a Java program to compare a given string to the specified string buffer

package com.it.sanfoundry;

public class Test10 {

	public static void main(String[] args) {
		String str1 = "Elone mosk";
		String str2 = "world";
		
		StringBuffer sb = new StringBuffer(str1);
		
		System.out.println(str1.contentEquals(sb));
		System.out.println(str2.contentEquals(sb));


	}

}
