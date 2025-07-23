package com.it.pradhan.stringjoiner;

import java.util.StringJoiner;

public class StringJoinerDemo {

	public static void main(String[] args) {
		StringJoiner sj = new StringJoiner("-");
		sj.add("prakash");
		sj.add("is");
		sj.add("good");
		sj.add("boy");
		System.out.println(sj);
		
		StringJoiner sj2 = new StringJoiner("-", "(", ")");
		sj2.add("ashok");
		sj2.add("it");
		sj2.add("java");
		System.out.println(sj2); // (ashok-it-java)

	}

}
