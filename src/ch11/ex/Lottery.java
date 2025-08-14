package ch11.ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Lottery {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Integer> num = new ArrayList<Integer>();
		for (int i = 0; i < 6; i++) {
			System.out.print("6개의 숫자 입력 (1~45): ");
			num.add(sc.nextInt());
		}

		List<Integer> win = new ArrayList<Integer>();
		while (win.size() < 6) {
			int number = (int) (Math.random() * 45 + 1);
			while (!win.contains(number)) {
				win.add(number);
			}
		}

		Collections.sort(win);

		System.out.println("너 번호: " + num);
		System.out.println("당첨 번호: " + win);
		int correct = 0;
		for (Integer integer : num) {
			if (win.contains(integer)) {
				correct++;
			}
		}
		System.out.println("맞은거: " + correct);
		sc.close();
	}
}
