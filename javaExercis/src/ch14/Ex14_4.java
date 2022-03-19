package ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Ex14_4 {

	public static void main(String[] args) {
	
		
		Map<Integer, Integer> map1 = new HashMap<>();
		map1.put(1, 5);
		map1.put(2, 6);
		map1.put(3, 7);
		map1.put(4, 8);
		
		
	
		
		map1.merge(1, 5, (v1,v2)->v1+v2);
		System.out.println(map1.get(1));
	
		
		
	}
}
