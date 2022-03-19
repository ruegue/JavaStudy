package javaCh10;


import java.text.*;
import java.util.*;

public class Exercise10_3 {
	static int paycheckCount(Calendar from, Calendar to) {
		if(from==null || to==null)
			return 0;
		
		if(from.get(Calendar.YEAR)==to.get(Calendar.MONTH)&&
				from.get(Calendar.MONTH)==to.get(Calendar.MONTH)&&
				from.get(Calendar.DATE)==to.get(Calendar.DATE)&&
				from.get(Calendar.DATE)==21)
			return 1;
		int monDiff = from.get(Calendar.YEAR)*12+from.get(Calendar.MONTH)-to.get(Calendar.YEAR)*12+to.get(Calendar.MONTH);
		if(monDiff<0)
			return 0;
		if(from.get(Calendar.DAY_OF_MONTH)<=21&&to.get(Calendar.DAY_OF_MONTH)>=21)
			++monDiff;
		if(from.get(Calendar.DAY_OF_MONTH)>21&&to.get(Calendar.DAY_OF_MONTH)<21)
			--monDiff;
		
		return monDiff;
	}
	
	
	static void printResult(Calendar from, Calendar to) {
		Date formDate = from.getTime();
		Date toDate = to.getTime();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.print(sdf.format(formDate) + " ~ " + sdf.format(toDate)+":");
		
		System.out.println(paycheckCount(from,to));
	}
	
	public static void main(String[] args) {
		Calendar fromCal = Calendar.getInstance();
		Calendar toCal = Calendar.getInstance();
		
		fromCal.set(2020, 0, 1);
		toCal.set(2020, 2,23);
		printResult(fromCal, toCal);
	}
}
