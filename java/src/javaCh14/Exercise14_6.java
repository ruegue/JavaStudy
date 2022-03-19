package javaCh14;

import java.util.Optional;
import java.util.stream.Stream;

public class Exercise14_6 {

	public static void main(String[] args) {
		
		Stream<String> strStream = Stream.of("aaa", "bb", "c","dddd");
		
		  Optional<Integer> max = strStream.map(String::length)
					.reduce(Integer::max);
		  
		  System.out.println(max.get());
		
	}

}
