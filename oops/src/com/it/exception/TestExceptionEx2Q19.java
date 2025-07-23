package com.it.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestExceptionEx2Q19 {

	public static void main(String[] args) {
		
		try {
			FileReader fr = new FileReader("c:\\documents\\text.txt");
		} catch (FileNotFoundException | NullPointerException e) {
			System.out.println("same action for both");
		}finally {
			System.out.println("Inside finally block");
		}

	}

}
