package ch14;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;
import static java.util.Comparator.*;

class Student2 {
	String name;
	boolean isMale;
	int hak;
	int ban;
	int score;
	
	Student2(String name, boolean isMale, int hak, int ban,int score){
		this.name = name;
		this.isMale = isMale;
		this.hak = hak;
		this.ban = ban;
		this.score = score;
	}

	public String getName() {return name;}
	public boolean isMale() {return isMale;}
	public int getHak() {return hak;}
	public int getBan() {return ban;}
	public int getScore() {return score;}
	
	@Override
	public String toString() {
		return String.format("[%s,%s, %d�г�, %d��, %3d��]",
				name, isMale ?"��":"��",hak,ban,score);
	}
	
	enum Level { HIGH, MID, LOW }
}


public class Ex14_10 {

	public static void main(String[] args) {
		Student2[] stuArr = {
			new Student2("���ڹ�", true, 1, 1, 300),
			new Student2("������", false, 1, 1, 250),
			new Student2("���ڹ�", true, 1, 1, 200),
			new Student2("���ڹ�", false, 1, 2, 150),
			new Student2("���ڹ�", true, 1, 2, 100),
			new Student2("���ڹ�", false, 1, 2, 50),
			new Student2("Ȳ�ڹ�", false, 1, 3, 100),
			new Student2("������", false, 1, 3, 150),
			new Student2("���ڹ�", true, 1, 3, 200),
			new Student2("���ڹ�", true, 2, 1, 300),
			new Student2("������", false, 2, 1, 250),
			new Student2("���ڹ�", true, 2, 1, 200),
			new Student2("������", false, 2, 2, 150),
			new Student2("���ڹ�", true, 2, 2, 100),
			new Student2("������", false, 2, 2, 50),
			new Student2("Ȳ����", false, 2, 3, 100),
			new Student2("������", false, 2, 3, 150),
			new Student2("���ڹ�", true, 2, 3, 200),
		};
		
		//System.out.printf("1. �ܼ�����(������ ����)%n");
		Map<Boolean, List<Student2>> stuBySex = Stream.of(stuArr)
						.collect(partitioningBy(Student2::isMale));
		
		List<Student2> maleStudent = stuBySex.get(true);
		List<Student2> femaleStudent = stuBySex.get(false);
		
		//for(Student2 s : maleStudent) System.out.println(s);
		//for(Student2 s : femaleStudent) System.out.println(s);
		
		System.out.printf("2. �ܼ����� + ���(���� �л���)%n");
		
		Map<Boolean, Long> stuNumBySex = Stream.of(stuArr)
				.collect(partitioningBy(Student2::isMale, counting()));
		
		System.out.println("���л� �� : "+stuNumBySex.get(true) );
		System.out.println("���л� �� : "+stuNumBySex.get(false) );
		
		System.out.printf("3. �ܼ����� + ���(���� 1��)%n");
		Map<Boolean, Optional<Student2>> topScoreBySex = Stream.of(stuArr)
				.collect(partitioningBy(Student2::isMale,maxBy(comparingInt(Student2::getScore))
						));
		
		System.out.println("���л� 1�� : "+topScoreBySex.get(true) );
		System.out.println("���л� 1��: "+topScoreBySex.get(false) );
		
		System.out.printf("4. �ܼ����� + ���հ�(���� 1��)%n");
		Map<Boolean, Map<Boolean, List<Student2>>> failBySex = 
				Stream.of(stuArr).collect(partitioningBy(Student2::isMale, 
						partitioningBy(s -> s.getScore() <=100)
						));
				
		List<Student2> failBySex1 = failBySex.get(true).get(true);				

		for(Student2 s : failBySex1 ) System.out.println(s);
		
	}

}
