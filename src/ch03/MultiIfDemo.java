package ch03;

import java.util.Scanner;

public class MultiIfDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int n = sc.nextInt();

		String grade = switch (n / 10) {
		case 10 -> "S";
		case 9 -> "A";
		case 8 -> "B";
		case 7 -> "C";
		default -> "F";
		};
		System.out.println(grade);

	}
}
