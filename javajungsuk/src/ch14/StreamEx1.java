package ch14;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx1 {

	public static void main(String[] args) {
		Stream<Student> studentStream = Stream.of(
					new Student("���ڹ�", 3, 300),
					new Student("���ڹ�", 1, 200),
					new Student("���ڹ�", 2, 100),
					new Student("���ڹ�", 2, 150),
					new Student("���ڹ�", 1, 200),
					new Student("���ڹ�", 3, 290),
					new Student("���ڹ�", 3, 180)
				);
 		
		Map<Integer, HashSet<Student>> names = studentStream.collect(Collectors.groupingBy(Student::getBan, Collectors.toCollection(HashSet::new)));
		System.out.println(names.get(1));
		
	}

}

class Student implements Comparable<Student>{
	String name;
	int ban;
	int totalScore;
	Student(String name, int  ban, int totalScore){
		this.name = name;
		this.ban = ban;
		this.totalScore = totalScore;
	}
	
	public String toString(){
		return String.format("[%s, %d, %d]" , name, ban, totalScore);
	}
	
	String getName() {return name;}
	int getBan() {return ban;}
	int getTotalScore() {return totalScore;}
	
	public int compareTo(Student s) {
		return s.totalScore - this.totalScore;
	}
}
