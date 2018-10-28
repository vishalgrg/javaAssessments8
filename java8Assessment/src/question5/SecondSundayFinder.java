package question5;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class SecondSundayFinder {

	public static void main(String[] args) {

		LocalDate localDate = LocalDate.now();
		LocalDate date = localDate.plusMonths(1);
		LocalDate date2 = date.with(TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.SUNDAY));

		System.out.println("next month's 2nd sunday will be on  :" + date2);
	}
}
