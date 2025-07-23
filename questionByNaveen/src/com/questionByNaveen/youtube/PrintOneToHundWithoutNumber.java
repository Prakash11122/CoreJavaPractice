//Interview Question: Print from 1 to 100 without using any numbers in your code

package com.questionByNaveen.youtube;

public class PrintOneToHundWithoutNumber {

	public static void main(String[] args) {
		
		//approach one
		int one = 'A'/'A';//1
		String s = "..........";
		
		for(int i=one; i<(s.length()*s.length()); i++) {
			System.out.println(i);
		}
		
		//approach two
		for(int i=one; i<='d'; i++) {
			System.out.println(i);
		}
	}

}
