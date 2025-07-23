package com.it.pradhan;

public class Palindrome1 {

	public static void main(String[] args) {
		//if  a number after reverse remains same is called palindrome number.
		
		int num=222;
		int number = num;
		
		int rev =0;
		while(num!=0) {
			int remainder = num%10;
			rev = rev*10+remainder;
			num = num/10;
		}
		System.out.println(rev);
		
		if(rev==number) {
			System.out.println(number +" number is palindrome");
		}else {
			System.out.println(number +" number is not palindrome");
		}

	}

}
