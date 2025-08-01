package ch05;

import java.util.Scanner;

public class ArrayDemo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] scores = new int[100];
		int sum = 0;
		int idx = 0;
		int x = 0;
		while (x != -1) {
			System.out.print("Enter a score (-1 to finish):");
			x = sc.nextInt();
			scores[idx] = x;
			sum += x;
			idx++;
		}

		System.out.println("sum: " + sum);
		System.out.println("average: " + sum / idx);

	}
}
