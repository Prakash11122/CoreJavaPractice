package com.it.pradhan.streamQuestions;

import java.util.function.Consumer;

public class MainMoviesConsumerEx9 {

	public static void main(String[] args) {
		
		Consumer<MoviesConsumerEx9> c1 = m -> System.out.println(m.getName() +" ready to release");
		
		Consumer<MoviesConsumerEx9> c2 = m -> System.out.println(m.getName()+" readyed but it is bigger flop");
		
		Consumer<MoviesConsumerEx9> c3 = m -> System.out.println(m.getName()+" Storing info. in database");
		
		
		Consumer<MoviesConsumerEx9> cc = c1.andThen(c2).andThen(c3);
		
		
		
		MoviesConsumerEx9 mc = new MoviesConsumerEx9("Something something", null);
		cc.accept(mc);
		

	}

}
