package com.it.pradhan;

import java.util.ArrayList;
import java.util.List;

public class TransperData {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("banana");
		fruits.add("lichi");
		fruits.add("orange");
		
		TransperData obj =  new TransperData();
		obj.printFruits(fruits);

	}

	public void printFruits(List<String> fruits) {
		
		for(String fruit : fruits) {
			System.out.println(fruit);
		}
		

	}
	

}