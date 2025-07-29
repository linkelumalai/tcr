package learn.dateandtime.legacy;

import java.util.TimeZone;

public class ListOfTimeZone {
	public static void main(String[] args) {
		System.out.println("Available time zones");
		String[] ids = TimeZone.getAvailableIDs();
		for (String id : ids) {
			System.out.println(id);
		}

	}
}
