package ch10.ex;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BankApplication_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		ArrayList<Account> accounts = new ArrayList<Account>();
		Map<String, Account> accounts = new HashMap<String, Account>();

		while (true) {
			System.out.println("----------------------------------------");
			System.out.println("1.계좌생성 |2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------------------------------------");
			System.out.print("선택> ");
			String i = sc.nextLine();
			if (i.equals("1")) {
				createAccount(sc, accounts);
			} else if (i.equals("2")) {
				showAccount(sc, accounts);
			} else if (i.equals("3")) {
				depositMoney(sc, accounts);
			} else if (i.equals("4")) {
				withdrawMoney(sc, accounts);
			} else if (i.equals("5")) {
				break;
			} else {
				System.out.println("잘못된 입력입니다.");
			}
		}
		System.out.println("프로그램 종료");
		sc.close();
	}

	private static void createAccount(Scanner sc, Map<String, Account> accounts) {
		System.out.println("--------");
		System.out.println("계좌생성>");
		System.out.println("--------");
		System.out.print("계좌번호");
		String account_num = sc.nextLine();
		if (accounts.containsKey(account_num)) {
			System.out.println("이미 존재하는 계좌입니다");
			return;
		}
		System.out.print("계좌주");
		String account_own = sc.nextLine();
		System.out.print("초기 입금액");
		String input = sc.nextLine();
		int money = Integer.parseInt(input);
		if (money < 0) {
			System.out.print("0원 이상 넣어야 합니다.");
			return;
		}
		accounts.put(account_num, new Account(account_num, account_own, money));

		System.out.print("결과: 계좌가 생성되었습니다.");

	}

	private static void showAccount(Scanner sc, Map<String, Account> accounts) {
		System.out.println("--------");
		System.out.println("계좌목록>");
		System.out.println("--------");
//		for (String account : accounts.keySet()) {
//			System.out.println(accounts.get(account));
//		}
		for (Account account : accounts.values()) {
			System.out.println(account);
		}
	}

	private static void depositMoney(Scanner sc, Map<String, Account> accounts) {
		System.out.println("--------");
		System.out.println("예금>");
		System.out.println("--------");
		System.out.print("계좌번호:");
		String account_num = sc.nextLine();
		System.out.print("예금액:");
		String input = sc.nextLine();
		int money = Integer.parseInt(input);
		if (money <= 0) {
			System.out.println("0원보다 큰 금액을 입력하세요");
			return;
		}

		if (accounts.containsKey(account_num)) {
			Account tmp = accounts.get(account_num);
			tmp.plusBalance(money);
		} else {
			System.out.println("존재하지 않는 계좌");
		}
	}

	private static void withdrawMoney(Scanner sc, Map<String, Account> accounts) {
		System.out.println("--------");
		System.out.println("출금>");
		System.out.println("--------");
		System.out.print("계좌번호:");
		String account_num = sc.nextLine();
		System.out.print("출금액");
		String input = sc.nextLine();
		int money = Integer.parseInt(input);
		if (accounts.containsKey(account_num)) {
			Account tmp = accounts.get(account_num);
			if (tmp.getBalance() >= money) {
				tmp.minusBalance(money);
			} else {
				System.out.println("잔고가 부족합니다");
			}
		} else {
			System.out.println("존재하지 않는 계좌");
		}
	}

}
