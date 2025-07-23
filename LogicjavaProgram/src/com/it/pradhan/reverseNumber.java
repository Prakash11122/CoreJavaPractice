package com.it.pradhan;

public class reverseNumber {

	public static void main(String[] args) {
		int num = 123;
		int rev = 0;

		System.out.println("Before number::" + num);

		while (num != 0) {
			int temp = num % 10;
			rev = rev * 10 + temp;
			num = num / 10;
		}
		System.out.println("After number::" + num);
		System.out.println("After reverse:"+rev);

	}

}
