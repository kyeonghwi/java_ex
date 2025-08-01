package ch03;

import java.util.Scanner;

public class ConditionDemo {
	public static void main(String[] args) {
		int x = 10;
		String s = "Shouhei";
		if (s.equalsIgnoreCase("sHOUHEI")) {
			System.out.println(1);
			System.out.println(1);
			System.out.println(1);
		}

		Scanner sc = new Scanner(System.in);
		System.out.print("input number: ");
		int num = sc.nextInt();

//		if (num % 2 == 0) {
//			System.out.println("even");
//		} else if (num % 2 == 1) {
//			System.out.println("odd");
//		}
//		System.out.println("end");

		if (num % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
		System.out.println("end");

	}
}
