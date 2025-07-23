package com.it.pradhan;

public class Palindrome {

	public static void main(String[] args) {

		int num = 121;
		int number = num;
		int reverse = 0;
		while (num != 0) {
			int remaindor = num % 10;
			reverse = reverse * 10 + remaindor;
			num = num / 10;

		}
		if (number == reverse) {
			System.out.println(number + " is palindrom");
		} else {
			System.out.println(number + " is not palindrom");
		}
	}

}
