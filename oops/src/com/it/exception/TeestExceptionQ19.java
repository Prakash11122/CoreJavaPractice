package com.it.exception;

import java.io.FileReader;

public class TeestExceptionQ19 {

	public static void main(String[] args) {

		try {
			FileReader f = new FileReader("c:\\documents\\text.txt");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("Inside finnaly block");
		}

	}

}
