package com.it.pradhan;

public class Factorial {

	public static void main(String[] args) {
		int f = 1;

		for (int i = 1; i <= 5; i++) {
			f = f * i;// f=1*1=1; f=1*2=2; f=2*3=6; f=6*4=24;f=24*5=120;
		}

		System.out.println(f);

	}

}
