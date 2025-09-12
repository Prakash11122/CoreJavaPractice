package com.it.pradhan.streamQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListUsingComparator {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(21);
		list.add(15);
		list.add(65);
		list.add(56);
		list.add(10);
		list.add(30);
		list.add(40);
		System.out.println(list);
		
		Collections.sort(list , new MyComparator());
		System.out.println(list);
		

	}

}
