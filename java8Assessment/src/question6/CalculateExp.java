package question6;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class CalculateExp {

	public static void main(String[] args) {
		LocalDate jdate = LocalDate.of(2018, Month.OCTOBER, 04);
		LocalDate current = LocalDate.now();
		Period exp = Period.between(current, jdate);
		System.out.println("My exp in wipro is : " + exp);
	}
}
