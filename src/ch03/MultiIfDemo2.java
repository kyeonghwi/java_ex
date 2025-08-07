package ch03;

import java.util.Scanner;

public class MultiIfDemo2 {
	public static void main(String[] args) {
		// scanner 를 선언한다.
		Scanner sc = new Scanner(System.in);
		// 점수를 입력하라는 출력문을 실행한다.
		System.out.print("점수를 입력하세요 (1 ~ 100) :  ");
		// 점수를 입력 받는다.
		int score = sc.nextInt();
		String grade = "";
		// 다중 if 문으로 입력받은 점수의 학점을 계산한다.
		if (score >= 90) { // A
			grade = "A";

		} else if (score >= 80) { // B
			grade = "B";

		} else if (score >= 70) { // C
			grade = "C";

		}

		else { // F
			grade = "F";
		}

		if (!grade.equals("F") && (score % 10) >= 5) {
			grade = grade + "+";
		}
		// 학점을 출력한다.
		System.out.println("당신의 학점은 " + grade + " 입니다.");
	}

}
