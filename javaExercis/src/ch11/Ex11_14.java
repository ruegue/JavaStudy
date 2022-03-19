package ch11;

import java.util.TreeSet;

public class Ex11_14 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		
		String from = "b";
		String to = "d";
		
		set.add("abc"); set.add("alien"); set.add("bat");
		
		set.add("car"); set.add("Car"); set.add("disc");
		
		set.add("dance"); set.add("dZZZZZ"); set.add("dzzzzz");
		
		set.add("elephant"); set.add("elevator"); set.add("fan");
		
		set.add("flower");
		
		int c1 = 'C';
		int c2 = 'c';
		
		
	
		System.out.println(set);
		System.out.println(set.subSet(from, to));
		System.out.println(set.subSet(from, to+"zzz"));
		
		
	}

}
