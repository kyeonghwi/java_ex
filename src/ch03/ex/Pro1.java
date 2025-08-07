package ch03.ex;

import java.util.Scanner;

public class Pro1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = 0;
		while (true) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			System.out.print("선택> ");
			int i = sc.nextInt();
			if (i == 1) {
				System.out.print("예금액>");
				int n = sc.nextInt();
				total += n;
			} else if (i == 2) {
				System.out.print("출금액>");
				int n = sc.nextInt();
				if (total >= n) {
					total -= n;
				} else {
					System.out.println("잔고가 부족합니다");
				}
			} else if (i == 3) {
				System.out.println("잔고>" + total);
			} else if (i == 4) {
				break;
			} else {
				System.out.println("잘못된 입력입니다.");
			}
		}
		System.out.println("프로그램 종료");
	}
}