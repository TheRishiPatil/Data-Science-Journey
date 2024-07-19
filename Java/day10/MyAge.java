package day10;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class MyAge {

	public static void main(String[] args) {
		
		LocalDate startDate = LocalDate.of(2002, 02, 14);  
		System.out.println(startDate);
		
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		long years = ChronoUnit.YEARS.between(startDate, today);
		long months = ChronoUnit.MONTHS.between(startDate.plusYears(years), today);
		long days = ChronoUnit.DAYS.between(startDate.plusYears(years).plusMonths(months) , today);
		
		System.out.println("Age is- " + years+ " Years , " +  months + " Months , " + days + " Days" );
		
	}

}
