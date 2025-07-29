package learn.dateandtime.newtimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class OfMethodsDemo {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2015, Month.MARCH, 18);
		System.out.println(date);

		LocalTime time = LocalTime.of(23, 50);
		System.out.println(time);

		LocalDateTime dateTime = LocalDateTime.of(date, time);
		System.out.println(dateTime);

		ZoneId newYork = ZoneId.of("America/New_York");
		ZonedDateTime zonedDateTime = ZonedDateTime.of(dateTime, newYork);
		System.out.println(zonedDateTime);
		
		LocalDate adddays = LocalDate.ofEpochDay(1000);
		System.out.println(adddays); // it add 1000 days from 1970 epoch
		
		LocalDate yearofday = LocalDate.ofYearDay(2025, 300);
		System.out.println(yearofday);
	}
}
