package learn.dateandtime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LegacyDateAPIDemo {

	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		System.out.println(date); // in this object date and time forced to use
		// in date constructor that return the system.timemillisec
		// and then calculate based on the Epoch fixed time and time

		System.out.println(date.getTime()); // 1753007285357

		Date date1 = new Date(200, 8, 26, 8, 45, 90);
		System.out.println(date1); // Sun Sep 26 08:46:30 IST 2100

		long futuredate = date1.getTime();
		System.out.println(futuredate);

		Date date2 = new Date(futuredate + 86400000);
		System.out.println(date2);

		// to compare the date we have 2 instance method they,
		// are before and after

		boolean isAfter = date2.after(date1);

		System.out.println(isAfter);

		boolean isBefore = date1.before(date2);

		System.out.println(isBefore);
		// in computer , Epoch is a fixed date and time used as
		// reference from which computer measures system time

		// formatting the date using simpledateFormatter

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		// yy - project last 2 digit of the year
		// HH - capital H project 24 hours format
		// hh - project 12 hours format

		System.out.println(dateFormat.format(date));

		SimpleDateFormat dateFormat1 = new SimpleDateFormat("MM/dd/yyyy	");

		System.out.println(dateFormat1.format(date));

		// simpledateformat's format method retuns string we have option to
		// again convert to date

		String currentDate = "2025-07-21 09:29:90";

		System.out.println(dateFormat.parse(currentDate));

	}
}
