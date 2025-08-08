package ch08;

import java.util.Calendar;

public class CalendarDemo {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();

		System.out.println(c);
		System.out.println(c.MONTH);
		System.out.println(c.get(c.DAY_OF_MONTH));
		System.out.println(c.get(c.YEAR));
		System.out.println(c.get(c.MONTH) + 1);

		Calendar c1 = Calendar.getInstance();
		System.out.println(c == c1);
		System.out.println(c.getTimeInMillis());
		System.out.println(c1.getTimeInMillis());

	}
}
