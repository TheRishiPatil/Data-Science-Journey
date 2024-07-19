package day10;

import java.time.Duration;
import java.time.Instant;

public class DemoInstant {

	public static void main(String[] args) {
		Instant now = Instant.now();
		System.out.println(now);
		
		Instant max = Instant.MAX;
		
		Duration interval = Duration.between(max, now);
		System.out.println("Time lasped : " + interval.toHours());
	}

}
