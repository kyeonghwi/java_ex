package ch03;

import java.util.Scanner;

public class Method1Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 개의 정수를 입력하세요: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		if (x > y) {
			int temp = x;
			x = y;
			y = temp;
		}

		System.out.printf("%d ~ %d sum = %d", x, y, sum(x, y));

	}

	public static int sum(int x, int y) {
		int total = 0;
		for (; x <= y; x++) {
			total += x;
		}
		return total;
	}
}
