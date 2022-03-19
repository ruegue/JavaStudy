package ch14;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex14_9 {

	public static void main(String[] args) {
		String[] strArr = {
				"Inheritance", "Java", "Lambda", "stream",
				"OptionalDouble", "IntStream", "count", "sum"
		};
		
		IntStream intStream1 = Stream.of(strArr).mapToInt(String::length);
		
		OptionalInt sum = intStream1.reduce((a,b)-> Integer.max(a, b));
		
		System.out.println(sum.getAsInt());
		
		
		
		
	
	}

}
