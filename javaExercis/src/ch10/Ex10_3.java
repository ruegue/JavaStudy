package ch10;

import java.util.Calendar;

public class Ex10_3 {

	public static void main(String[] args) {
		final int[] TIME_UNIT = {3600, 60, 1};
		final String[] TIME_UNIT_NAME = {"시간", "분", "초"};
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		date1.set(Calendar.HOUR_OF_DAY, 10);
		date1.set(Calendar.MINUTE, 20);
		date1.set(Calendar.SECOND, 30);
		
		date2.set(Calendar.HOUR_OF_DAY, 20);
		date2.set(Calendar.MINUTE, 30);
		date2.set(Calendar.SECOND, 10);
		
		System.out.println(date1.get(Calendar.HOUR_OF_DAY)+"시 "+ date1.get(Calendar.MINUTE)+"분 "+date1.get(Calendar.SECOND)+"초" );
		System.out.println(date2.get(Calendar.HOUR_OF_DAY)+"시 "+ date2.get(Calendar.MINUTE)+"분 "+date2.get(Calendar.SECOND)+"초" );
		
		long difference = Math.abs(date1.getTimeInMillis()- date2.getTimeInMillis())/1000;
		System.out.println(difference);
		System.out.println(difference/3600);
		System.out.println(difference%3600/60);
		System.out.println(difference%3600%60);
		
	}

}
