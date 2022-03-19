package ch14;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamEx4 {

	public static void main(String[] args) {
		Stream<String[]> strArrStrm = Stream.of(
				new String[] {"abc", "def", "jkl"},
				new String[] {"ABC", "GHI", "JKL"}
			);
		
		Stream<String> strStrm = strArrStrm.flatMap(Arrays::stream);
		
		strStrm.map(String::toLowerCase)
				.distinct()
				.sorted()
				.forEach(System.out::println);
		System.out.println();
	}

}
