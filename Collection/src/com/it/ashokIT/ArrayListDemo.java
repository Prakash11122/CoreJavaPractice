package com.it.ashokIT;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList(5);//elementData
		//List l1 = new ArrayList();
		
		al.add(10);//elementData[0]=10;
		
		al.add("java");//elementData[1]="java";
		al.add(new Employee().getName());
		al.add(29);
		al.add(39);
		al.add(49);
		al.add(59);
		al.add(69);
		System.out.println(al);
		
		
	}
	
	
	

}
