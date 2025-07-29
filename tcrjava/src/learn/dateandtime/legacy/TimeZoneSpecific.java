package learn.dateandtime.legacy;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class TimeZoneSpecific {

	public static void main(String[] args) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MMMM-dd HH:mm:ss");
		dateFormat.setTimeZone(TimeZone.getTimeZone("America/New_York"));
		System.out.println(dateFormat.format(new Date()));

		dateFormat.setTimeZone(TimeZone.getTimeZone("Europe/Vatican"));
		System.out.println(dateFormat.format(new Date()));

		// to avoid this lengthy code simply use greogerian cal

		GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("America/New_York"));

		// it will return the current system time because internally it going to return
		// the new system time in millisec
		System.out.println(gregorianCalendar.getTime());
		dateFormat.setTimeZone(TimeZone.getTimeZone("America/New_York"));
		System.out.println(dateFormat.format(gregorianCalendar.getTime()));
	}
}
