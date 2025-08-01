package ch04.sec07;

import java.util.Scanner;

public class DiceEx {
	public static void main(String[] args) {
		Dice dice = new Dice();
		dice.roll();
		Scanner sc = new Scanner(System.in);
		System.out.print("주사위 굴리 횟수 입력:");
		int n = sc.nextInt();
		dice.roll(n);
	}
}

class Dice {
	public void roll() {
		int result = 0;
		result = (int) ((Math.random() * 6) + 1);
		System.out.println(result);
	}

	public void roll(int n) {
		for (int i = 0; i < n; i++) {
			roll();
		}
	}
}