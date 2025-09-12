package com.it.pradhan.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class EvenNumberGreaterThan10 {
	
	public static void main(String[] args) {
		List<Integer> ls = Arrays.asList(4,6,8,5,10,33,2,444,55,22,44);
		Predicate<Integer> p1 = ele -> ele%2 == 0;
		Predicate<Integer> p2 = ele -> ele>10;
//		for(Integer e :ls) {
//			  if(p1.and(p2).test(e)) {
//				  System.out.println(e);
//			  }
//		} 
		
		
		
	}

}
