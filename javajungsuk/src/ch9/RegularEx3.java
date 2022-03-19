package ch9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx3 {

	public static void main(String[] args) {
		String source = "HP:011-1123-1111, HOME:02-999-9999 ";
		String pattern = "(\\d{1})";
		
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(source);
		
		int i=0;
		while(m.find()) {
			System.out.println(++i + ": " +m.group(1));
		}
	}

}
