package javaCh10;

import java.text.*;
import java.util.*;

public class Exercise10_1 {
	
	public static void main(String[] args) {
	
	Calendar cal = Calendar.getInstance();
	
	
	
	for(int i=0; i<12; i++) {
		cal.set(2020, i, 1);
		if(cal.get(Calendar.DAY_OF_WEEK)==1) {
			cal.set(2020, i, 8);
			Date d = cal.getTime();
			System.out.println(new SimpleDateFormat("yyyy-MM-dd은 F번째 E요일입니다.").format(d));
		}else {
			cal.set(2020, i, 16-cal.get(Calendar.DAY_OF_WEEK));
			Date d = cal.getTime();
			System.out.println(new SimpleDateFormat("yyyy-MM-dd은 F번째 E요일입니다.").format(d));
		}
	}
		
	}
}	

