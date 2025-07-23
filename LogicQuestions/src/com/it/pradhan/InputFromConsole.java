package com.it.pradhan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputFromConsole {
	
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a String");
		
		String name = bf.readLine();
		
		System.out.println(name);
		
	}

}
