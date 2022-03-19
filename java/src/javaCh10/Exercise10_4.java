package javaCh10;

import java.text.SimpleDateFormat;
import java.util.*;

public class Exercise10_4 {

	public static void main(String[] args) {
		Calendar birthday = Calendar.getInstance();
		birthday.set(2000, 0, 1);
		Date d1 = birthday.getTime();
		
		
		Calendar today = Calendar.getInstance();
		today.set(2016, 0, 29);
		Date d2 = today.getTime();
		
		long difference = Math.abs(birthday.getTimeInMillis()-today.getTimeInMillis())/1000;
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("birth day="+sdf1.format(d1));
		System.out.println("today="+sdf1.format(d2));
		System.out.println(difference/(24*60*60)+" days");
	}

}
