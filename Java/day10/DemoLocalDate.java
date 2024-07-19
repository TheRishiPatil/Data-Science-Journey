package day10;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class DemoLocalDate {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		LocalDate christmas = LocalDate.of(2024, 12, 25);
		System.out.println(today.isBefore(christmas));
		
		
		long daysleft = today.until(christmas, ChronoUnit.DAYS);
		System.out.println("Days left for Christmas: " + daysleft);
		
		LocalDate tomorrow = today.plusDays(1);
		LocalDate nextweek = today.plusWeeks(1);
		System.out.println(nextweek.getYear());
		System.out.println(nextweek.getMonth());
		System.out.println(nextweek.getMonthValue());

		Stream<LocalDate> year2024 = LocalDate.of(2024, 1, 1).datesUntil(LocalDate.of(2025, 1, 1));
		Predicate<LocalDate> fridays = (date) -> date.getDayOfWeek().equals(DayOfWeek.FRIDAY);
		Predicate<LocalDate> the13th = (date) -> date.getDayOfMonth()==13;
		
		year2024.filter(the13th).filter(fridays).forEach(System.out::println);
		
	}

}
