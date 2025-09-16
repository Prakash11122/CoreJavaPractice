package com.it.pradhan.streamQuestions;

import java.util.function.Predicate;

public class PredicateEx4 {
	public static void main(String[] args) {
		
		String[] sa = {"Ram", "Laxman" , "Sita", "Bibhisan","Ravan", "RadheKarn"};
		
		
		
		//Predicate<String> listofString = str -> str.length() > 5;
		
		
		
		//Q.Print the string which length is even?
		Predicate<String> nameLength = str -> str.length()%2==0;
		
		for(String str:sa) {
			if(nameLength.test(str)) {
				System.out.println(str);
			}
		}
		
		
	}

}
