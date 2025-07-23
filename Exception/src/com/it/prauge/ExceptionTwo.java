package com.it.prauge;

import java.io.PrintWriter;

public class ExceptionTwo {

	public static void main(String[] args) {
		try {
		PrintWriter pw = new PrintWriter("abc.txt");
		pw.println("Hello");
		}catch (Exception e) {
			System.out.println("FileNotFoundException");
		}

	}

}
