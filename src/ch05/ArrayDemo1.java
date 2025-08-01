package ch05;

import java.util.Scanner;

public class ArrayDemo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] scores = new int[5];
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			scores[x] = y;
			sum += y;
		}

		System.out.println("sum: " + sum);
		System.out.println("average: " + sum / scores.length);

	}
}
