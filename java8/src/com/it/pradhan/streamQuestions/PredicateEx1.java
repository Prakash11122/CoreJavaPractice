package com.it.pradhan.streamQuestions;

public interface PredicateEx1 {
	
	public default boolean Test(Integer i) {
		if(i %2==0) {
			return true;
		}else {
			return false;
		}
	}
	
	//i -> i%2==0;

}
