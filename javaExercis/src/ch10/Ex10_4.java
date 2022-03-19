package ch10;

import java.util.Calendar;

public class Ex10_4 {

	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		
		date.set(2019, 7, 31);
		
		System.out.println(toString(date));
		date.add(Calendar.DATE, 1);
		System.out.println(toString(date));
		
		date.add(Calendar.MONTH, -6);
		System.out.println(toString(date));
		
		date.roll(Calendar.DATE,31);
		System.out.println(toString(date));
		
		date.add(Calendar.DATE,31);
		System.out.println(toString(date));
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"³â "+date.get(Calendar.MONTH)+"¿ù "+date.get(Calendar.DATE)+"ÀÏ ";  
	}

}
