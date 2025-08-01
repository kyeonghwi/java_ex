package ch05;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> scores = new ArrayList<>();
		int sum = 0;
		int x = 0;
		int cnt = 0;
		while (x != -1) {
			System.out.print("Enter a score (-1 to finish):");
			x = sc.nextInt();
			scores.add(x);
			sum += x;
			cnt++;
		}

		System.out.println("sum: " + sum);
		System.out.println("average: " + sum / scores.size());
	}
}
