package javaCh14;

import java.util.stream.Stream;

public class Exercise14_5 {

	public static void main(String[] args) {
		
		Stream<String> strStream = Stream.of("aaa","bb","c","dddd");
		
		int sum = strStream.map(String::length)
					.reduce(0,(a,b)->a+b);
		System.out.println(sum);
					
		
	}

}
