package ch03;

import java.util.Scanner;

public class NestedIfDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "..."; // string
		System.out.println(str);

//		if (str != null) {
//			if (str.length() == 0) {
//				System.out.println("null string");
//			} else {
//				System.out.println(str.length() + " length string");
//			}
//		}

		if (str != null && str.length() > 0) {
			System.out.println(str.length() + " length string");
		} else {
			System.out.println("null string");
		}

	}
}
