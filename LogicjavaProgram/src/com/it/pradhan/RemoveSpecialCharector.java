//Write a java program to remove all special charactor from given string

package com.it.pradhan;

public class RemoveSpecialCharector {

	public static void main(String[] args) {
		String str="#i@lo%$ve!yo#@u&";
				
		String replaceAll = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(replaceAll);

	}

}
