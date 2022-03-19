package ch10;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatterEx2 {

	public static void main(String[] args) {
		LocalDate newYear = LocalDate.parse("2016-01-01",DateTimeFormatter.ISO_LOCAL_DATE);
		
		
		System.out.println(newYear);
	}

}
