package ch11.ex;

import java.util.ArrayList;

public class Pro1 {
	public static void main(String[] args) {
		ArrayList<String> string = new ArrayList<String>();
		string.add("seagull");
		string.add("butterfly");
		string.add("squirrel");
		string.add("lama");
		for (String string2 : string) {
			if (string2.length() > 4) {
				System.out.println(string2);
			}
		}
	}
}
