package ch10;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

class DayAfterTomorrow implements TemporalAdjuster{

	@Override
	public Temporal adjustInto(Temporal temporal) {
		return temporal.plus(2,ChronoUnit.DAYS);
	}
	
}

public class NewTimeEx3 {
	
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate date = today.with(new DayAfterTomorrow());
		
		System.out.println(today.with(TemporalAdjusters.firstDayOfNextMonth()));
	}
}
