package ch05.ex;

import java.util.Scanner;

public class Pro3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String url = "";
		while (true) {
			System.out.print("Input URL: ");
			url = sc.nextLine();

			if (url.equals("bye")) {
				break;
			}

			if (url.endsWith("com")) {
				System.out.println(url + "은 'com'으로 끝납니다.");
			} else {
				System.out.println(url + "은 'com'으로 안끝납니다.");
			}
			if (url.contains("java")) {
				System.out.println(url + "은 'java'를 포함합니다.");
			} else {
				System.out.println(url + "은 'java'를 포하지 않습니다.");
			}
			if (url.startsWith("www")) {
				System.out.println(url + "은 'www'로 시작합니다.");
			} else {
				System.out.println(url + "은 'www'로 시작하지 않습니다.");
			}

		}
		System.out.println("end");

	}
}
