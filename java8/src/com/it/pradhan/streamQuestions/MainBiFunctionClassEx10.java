package com.it.pradhan.streamQuestions;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class MainBiFunctionClassEx10 {

	public static void main(String[] args) {
		
		ArrayList<BiFunctionClassEx10> l = new  ArrayList<BiFunctionClassEx10>();
		
		BiFunction<Integer, String, BiFunctionClassEx10> f = (eno, name) -> new BiFunctionClassEx10(eno, name);

		System.out.println(f.apply(10, "Guna"));
		
		l.add(f.apply(1, "praku"));
		l.add(f.apply(2, "prague"));
		l.add(f.apply(3, "prakash"));
		l.add(f.apply(4, "prakaash"));
		l.add(f.apply(5, "pradha"));
		l.add(f.apply(6, "kumar"));
		
		
		for(BiFunctionClassEx10 e:l) {
			System.out.println(e.eno);
			System.out.println(e.name);
		}
		
		
		
	}

}
