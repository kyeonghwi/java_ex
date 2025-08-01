package ch05;

import java.util.Arrays;
import java.util.Scanner;

public class Arraydemo {
	public static void main(String[] args) {
//		int[] score = { 92, 100, 78, 69, 85 };
//		int[] scores;
//		scores = new int[] {1,1,1,1,1};
//		
		Scanner sc = new Scanner(System.in);
		int[] scores = new int[5];
		for (int i = 0; i < scores.length; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			scores[x] = y;
		}
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}

		// for (type 변수이름 : 배열이름)
		for (int score : scores) {
			sum += score;
		}
		System.out.println("sum score: " + sum);
		System.out.println("average score: " + (double) sum / scores.length);

		System.out.println(Arrays.toString(scores));

		char[] cArr = { 'a', 'b', 'c' };
		System.out.println(cArr);

		double[] dArr = { 10.0, 20.0, 30.0 };
		System.out.println(dArr);

	}
}
