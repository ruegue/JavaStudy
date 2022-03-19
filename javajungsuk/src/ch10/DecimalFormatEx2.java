package ch10;

import java.text.DecimalFormat;
import java.text.ParseException;

public class DecimalFormatEx2 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,#.##");
		
		try {
			 Number num = df.parse("1,234,567.89");
			 double d = num.doubleValue();
			 System.out.println(d);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
