//1.Print from 1 to 100 without using any numbers in your code
package com.it.pradhan.number;

public class PrintOneToHundread {

	public static void main(String[] args) {
		
		int one = 'A'/'A';//1
		String s1 = "..........";
		//logic-1
//		for(int i=one; i<=(s1.length() * s1.length()); i++) {
//			System.out.println(i);
//		}
		
		//logic-2
		//a=97, b=98, c=99, d=100
		for(int i=one; i<='d'; i++) {
			System.out.println(i);
		}
		
	}

}
