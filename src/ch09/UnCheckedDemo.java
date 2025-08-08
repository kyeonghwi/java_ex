package ch09;

import java.util.StringTokenizer;

public class UnCheckedDemo {
	public static void main(String[] args) {
		// int res = 5 / 0; // ArithmeticException

		String str = ""; // NullPointerException
		System.out.println(str.length());

		int[] Arr = new int[0]; // NullPointerException
		System.out.println(Arr.length);

		System.out.println(Arr[3]); // ArrayIndexOutOfBoundsException

		String s = "a b c";
		StringTokenizer st = new StringTokenizer(s);
		while (st.hasMoreTokens()) {
			st.nextToken();
		}
		st.nextToken(); // NoSuchElementException
	}
}
