package lab9.prob1;

import java.util.stream.IntStream;

public class Prob1A {
	//code runs forever
	public static void main(String[] args) {
		//IntStream ones = IntStream.generate(() -> 1).distinct();
     //	IntStream ones = IntStream.generate(() -> 1).limit(20).distinct();
		IntStream two = IntStream.generate(() -> 1).distinct().limit(20);

 // IntStream two = IntStream.generate(Math.random()).distinct().limit(20);

		two.forEach(System.out::println);
		//ones.forEach(System.out::println);
	}


}
