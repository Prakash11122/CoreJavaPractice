package com.it.pradhan.methodReference;

import java.util.StringJoiner;

public class StringJoinner {

	public static void main(String[] args) {
		StringJoiner sj = new StringJoiner(null);
		sj.add("Prakash");
		sj.add("Kumar");
		sj.add("Pradhan");
		
		System.out.println(sj);

	}

}
