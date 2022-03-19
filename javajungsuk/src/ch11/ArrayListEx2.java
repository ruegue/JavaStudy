package ch11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx2 {

	public static void main(String[] args) {
		final int LIMIT = 3;
		String source = "0123456789";
		int length = source.length();
		
		List list = new ArrayList(3 + length);
		
		for(int i=0; i<length ; i+=LIMIT) {
			if(i+LIMIT<length)
			list.add(source.substring(i, i+LIMIT));
			else
			list.add(source.substring(i));
		}
		
		for(int i=0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
