package beakjoon;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] burger = new int[3];
		int[] drink = new int[2];
		for (int i = 0; i < 3; i++) {
			burger[i] = sc.nextInt();
		}
		for (int i = 0; i < 2; i++) {
			drink[i] = sc.nextInt();
		}
		System.out.println(Math.min(burger[0], Math.min(burger[1], burger[2])) + Math.min(drink[0], drink[1]) - 50);

	}
}