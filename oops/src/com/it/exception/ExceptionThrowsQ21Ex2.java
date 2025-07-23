package com.it.exception;

import java.io.IOException;

public class ExceptionThrowsQ21Ex2 {
	
	public static void method() throws IOException {
		throw new IOException("IOException occured");
	}

	public static void main(String[] args) {
		try {
			method();
		} catch (Exception e) {
			System.out.println("Exception handled");
		}
		

	}

}
