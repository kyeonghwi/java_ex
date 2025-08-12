package ch10.ex;

import java.util.ArrayList;
import java.util.Scanner;

public class BankApplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Account> accounts = new ArrayList<Account>();

		while (true) {
			System.out.println("----------------------------------------");
			System.out.println("1.계좌생성 |2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------------------------------------");
			System.out.print("선택> ");
			String i = sc.nextLine();
			if (i.equals("1")) {
				System.out.println("--------");
				System.out.println("계좌생성>");
				System.out.println("--------");
				System.out.print("계좌번호");
				String account_num = sc.nextLine();
				boolean found = false;
				for (Account account : accounts) {
					if (account.getAccountNO().equals(account_num)) {
						System.out.println("이미 존재하는 계좌입니다");
						found = true;
					}
				}
				if (found) {
					continue;
				}
				System.out.print("계좌주");
				String account_own = sc.nextLine();
				System.out.print("초기 입금액");
				String input = sc.nextLine();
				int money = Integer.parseInt(input);
				if (money < 0) {
					System.out.print("0원 이상 넣어야 합니다.");
				}
				accounts.add(new Account(account_num, account_own, money));

				System.out.print("결과: 계좌가 생성되었습니다.");

			} else if (i.equals("2")) {
				System.out.println("--------");
				System.out.println("계좌목록>");
				System.out.println("--------");
				for (Account account : accounts) {
					System.out.println(account);
				}

			} else if (i.equals("3")) {
				System.out.println("--------");
				System.out.println("예금>");
				System.out.println("--------");
				System.out.print("계좌번호:");
				String account_num = sc.nextLine();
				System.out.print("예금액:");
				String input = sc.nextLine();
				int money = Integer.parseInt(input);
				boolean found = false;
				for (Account account : accounts) {
					if (account.getAccountNO().equals(account_num)) {
						account.plusBalance(money);
						found = true;
					}
				}
				if (!found) {
					System.out.println("존재하지 않는 계좌");
				}
			} else if (i.equals("4")) {
				System.out.println("--------");
				System.out.println("출금>");
				System.out.println("--------");
				System.out.print("계좌번호:");
				String account_num = sc.nextLine();
				System.out.print("출금액");
				String input = sc.nextLine();
				int money = Integer.parseInt(input);
				boolean found = false;
				for (Account account : accounts) {
					if (account.getAccountNO().equals(account_num)) {
						found = true;
						if (account.getBalance() >= money) {
							account.minusBalance(money);
						} else {
							System.out.println("잔고가 부족합니다");
						}
					}
				}
				if (!found) {
					System.out.println("존재하지 않는 계좌");
				}
			} else if (i.equals("5")) {
				break;
			} else {
				System.out.println("잘못된 입력입니다.");
			}
		}
		System.out.println("프로그램 종료");
	}

}
