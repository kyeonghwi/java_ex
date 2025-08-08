package ch08.ex;

import java.util.Calendar;

public class Pro3 {
	public static void main(String[] args) {
		String[] weekName = { "", "sun", "mon", "tue", "wed", "thu", "fri", "sat" };
		String[] noonName = { "morning", "afternoon" };
		Calendar c = Calendar.getInstance();

		int year = c.get(c.YEAR);
		int month = c.get(c.MONTH) + 1;
		int day = c.get(c.DAY_OF_MONTH);
		String week = weekName[c.get(c.DAY_OF_WEEK)];
		String noon = noonName[c.get(c.AM_PM)];
		int hour = c.get(c.HOUR_OF_DAY);
		int minute = c.get(c.MINUTE);
		int second = c.get(c.SECOND);

		System.out.println(year + "year " + month + "month " + day + "day");
		System.out.println(week + "day " + noon);
		System.out.println(hour + "hour " + minute + "minute " + second + "second");
	}
}
