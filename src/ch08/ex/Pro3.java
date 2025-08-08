package ch08.ex;

import java.util.Calendar;

public class Pro3 {
	public static void main(String[] args) {
		String[] weekName = { "sun", "mon", "tue", "wed", "thu", "fri", "sat" };
		String[] noonName = { "morning", "afternoon" };
		Calendar c = Calendar.getInstance();

		int year = c.getWeekYear();

		System.out.println(year);
	}
}
