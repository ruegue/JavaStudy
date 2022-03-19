package ch10;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatterEx1 {

	public static void main(String[] args) {
		ZonedDateTime zdateTime = ZonedDateTime.now();
		LocalDate time = LocalDate.now();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_DATE));
	}

}
