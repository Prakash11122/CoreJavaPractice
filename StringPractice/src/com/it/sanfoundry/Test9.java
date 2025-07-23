
//Write a program to compare a given string to the specified character sequence

package com.it.sanfoundry;

public class Test9 {

	public static void main(String[] args) {
		String str1 = "Elone mosk";
		String str2 = "world";
		CharSequence cs = "Elone mosk";
		System.out.println("Comparing '"+str1+"'"+" and '"+cs+"' : " + str1.contentEquals(cs));
		System.out.println(str2.contentEquals(cs));

	}

}
