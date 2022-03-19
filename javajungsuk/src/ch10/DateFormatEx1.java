package ch10;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatEx1 {

	public static void main(String[] args) {
		Date today = new Date();
		
		SimpleDateFormat sdf1, sdf2, sdf3, sdf4;
		SimpleDateFormat sdf5, sdf6, sdf7, sdf8;
		
		sdf1 = new SimpleDateFormat("yy년 MMM dd일 E요일");
		
		System.out.println(sdf1.format(today));
		
	}

}
