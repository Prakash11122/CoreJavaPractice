package com.it.prauge;

public class Overloading {

	void max(int a, int b) {
		if (a > b)
			System.out.println(a);
		else
			System.out.println(b);

	}
	
	void max(int a, int b, int c) {
		if((a>b) && (a>c))
			System.out.println(a);
		else if (b>c)
			System.out.println(b);
		else
			System.out.println(c);
	}
	
	public static void main(String[] args) {
		Overloading pt =new Overloading();
		pt.max(11, 12);
		pt.max(11, 12, 13);
	}

}
