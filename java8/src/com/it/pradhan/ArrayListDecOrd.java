//Task: WAJP to store numbers in ArrayList and sort numbers in desending order
package com.it.pradhan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class ArrayListDecOrd {
	
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(9);
		al.add(88);
		al.add(44);
		
		System.out.println("Before short:"+al);
		Collections.sort(al);

		System.out.println("After Sort :: " + al);
	}
	

}
