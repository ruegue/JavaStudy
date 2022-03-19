package ch9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class RegularEx1 {

	public static void main(String[] args) {
		String [] data = {"bat", "baby","bonus", "cA", "ca", "co", "c.","c",
							"c0", "car", "combat", "count", "date", "disc"};
		
		Pattern p = Pattern.compile("c[a-z]");
		
		for(int i=0; i< data.length; i++) {
			Matcher m = p.matcher(data[i]);
			if(m.find())
				System.out.println(data[i] +",");
		
		}
	}

}
