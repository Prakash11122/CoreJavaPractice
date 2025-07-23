package com.it.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestExceptionEx1Q19 {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("c:\\documents\\text.txt");
		} catch (FileNotFoundException e) {
			System.out.println("Action when file is not found");
		}catch (NullPointerException e) {
			System.out.println("Action for NullPointerException");
		}catch (Exception e) {
			System.out.println("Action for Exception other than"+"FileNotFoundException/NullPointerException");
		}finally {
			System.out.println("inside finnaly block");
		}
		

	}

}
