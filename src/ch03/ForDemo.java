package ch03;

import java.util.Scanner;

public class ForDemo {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			for (int j = 10; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < i * 2 - 1; k++) {
				if (k == i - 1) {
					System.out.print(i);
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		for (int i = 8; i >= 0; i--) {
			for (int j = 10; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < i * 2 - 1; k++) {
				if (k == i - 1) {
					System.out.print("|");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		Scanner sc = new Scanner(System.in);
		System.out.print("input number:");
		int n = sc.nextInt();

		for (int i = 1; i < 20; i++) {
			System.out.printf("%d * %d = %d \n", n, i, n * i);
		}
	}
}
