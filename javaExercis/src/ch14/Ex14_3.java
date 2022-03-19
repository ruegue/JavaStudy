package ch14;

import java.util.function.Predicate;

public class Ex14_3 {

	public static void main(String[] args) {
		Predicate<Integer> p = i -> i<100;
		Predicate<Integer> q = i -> i<200;
		Predicate<Integer> r = i -> i%2 ==0;
		Predicate<Integer> notp = p.negate();
		
		Predicate<Integer> all = notp.and(q.or(r));
		System.out.println(all.test(150));
		
		String str1 = "adc";
		String str2 = "adc";
		
		Predicate<String> p2 = Predicate.isEqual(str1);
		boolean result = p2.test(str2);
		
		
	}

}
