package ch10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormatEx2 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2015, 9, 3);
		
		Date day = cal.getTime();
		
		SimpleDateFormat sdf1;
		
		sdf1 = new SimpleDateFormat("HH:mm:ss.SSS");
		
		System.out.println(sdf1.format(day));
	}

}
