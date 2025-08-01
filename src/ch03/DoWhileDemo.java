package ch03;

import java.util.Scanner;

public class DoWhileDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.print("input value: ");
			n = sc.nextInt();
		} while (n != 0);
		System.out.println("end");

		int num = 0;
		while (num < 11) {
			System.out.println(num);
			num += 2;
		}
	}
}
