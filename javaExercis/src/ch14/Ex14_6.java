package ch14;

import java.io.File;
import java.util.stream.Stream;

public class Ex14_6 {

	public static void main(String[] args) {
		File[] fileArr = {new File("Ex1.java"), new File("Ex1.bak"),
				new File("Ex2.java"), new File("Ex1"), new File("Ex1.txt")
		};
		
		Stream<File> fileStream = Stream.of(fileArr);
		
		fileStream.map(File::getName)
			.filter(s -> s.indexOf('.')!=-1)
			.peek(s->System.out.printf("filename=%s%n",s))
			.map(s -> s.substring(s.indexOf('.')+1))
			.map(String::toUpperCase)
			.peek(s->System.out.printf("extension=%s%n",s))
			.distinct()
			.forEach(System.out::print);
			
			System.out.println();
	
		}
}


