package ch03;

import java.util.Scanner;

public class WHileDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		while (cnt < n) {
			System.out.println("infinite loop-" + cnt);
			cnt++;
		}
		for (int j = 0; j < n; j++) {
			System.out.println("infinite loop-" + j);
		}
		int k = 0;
		while (true) {
			System.out.println("infinite loop-" + k);
			k++;

			if (k >= n) {
				break;
			}
		}
	}
}
