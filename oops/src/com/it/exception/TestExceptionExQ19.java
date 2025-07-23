package com.it.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestExceptionExQ19 {

	public static void main(String[] args) {
		
		try {
		FileReader dr = new FileReader("nonexistent.txt");
		BufferedReader bf = new BufferedReader(dr);
		System.out.println(bf.readLine());
		bf.close();
		}catch (FileNotFoundException e) {
			System.out.println("File not found: " + e.getMessage());
		}catch (IOException e) {
			System.out.println("I/O error: " + e.getMessage());
		}catch (Exception e) {
			System.out.println("An error occurred: " + e.getMessage());
		}

	}

}
