package com.it.pradhan;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<String> names = new LinkedList<String>();
		
		names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        
        System.out.println(names);
        
        names.add(1, "pk");
        System.out.println(names);
        
        names.remove(1);
        System.out.println(names);

	}

}
