package day10;

import java.time.LocalDate;

public class ProgrammersDay {

	public static void main(String[] args) {
		
		int year= 2001;
		int day = 256;
		if ( year % 4 == 0 ) {
			
			LocalDate proday = LocalDate.ofYearDay(year, day);
			System.out.println("Programmers day is on: " + proday);
		}
		else {
			LocalDate proday = LocalDate.ofYearDay(year, day);
			System.out.println("Programmers day is on: " + proday);
		}
	}
}
