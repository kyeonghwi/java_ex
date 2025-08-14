package ch11.ex;

import java.util.ArrayList;
import java.util.Scanner;

public class Pro4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> scores = new ArrayList<Integer>();
		while (true) {
			System.out.print("input score: ");
			int n = sc.nextInt();
			if (n == -1) {
				break;
			}
			scores.add(n);
		}
		int max = 0;
		System.out.print("student's score : ");
		for (Integer integer : scores) {
			System.out.print(integer + " ");
			if (integer > max) {
				max = integer;
			}
		}
		System.out.println();
		String grade = "";
		for (int i = 0; i < scores.size(); i++) {
			if ((max - scores.get(i)) <= 10) {
				grade = "A";
			} else if ((max - scores.get(i)) <= 20) {
				grade = "B";
			} else {
				grade = "C";
			}
			System.out.printf("%d student' score: %d, grade:%s \n", i, scores.get(i), grade);
		}

		sc.close();
	}
}
