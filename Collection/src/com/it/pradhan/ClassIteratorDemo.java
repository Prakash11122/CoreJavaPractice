package com.it.pradhan;

import java.util.ArrayList;
import java.util.Iterator;

public class ClassIteratorDemo {

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		for(int i=0; i<=10; i++) {
			l.add(i);
		}
		System.out.println(l);
		Iterator itr = l.iterator();
		while(itr.hasNext()) {
			Integer al = (Integer)itr.next();
			
			if(al%2==0)
				System.out.println(al);
			else
				itr.remove();
		}
		
		System.out.println(l);

	}

}
