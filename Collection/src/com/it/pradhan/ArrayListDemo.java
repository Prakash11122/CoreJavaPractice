package com.it.pradhan;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        
        String name = names.get(2);
        System.out.println(name);
        
        names.add(1, "pk");
        System.out.println(names);
        
        names.remove(1);
        System.out.println(names);
		
		

	}

}
