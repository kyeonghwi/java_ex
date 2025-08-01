package ch03;

import java.util.Scanner;

public class MyMathDemo {
	public static void main(String[] args) {
		MyMath math = new MyMath();

		Scanner sc = new Scanner(System.in);
		System.out.print("두 개의 정수를 입력하세요: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		if (x > y) {
			int temp = x;
			x = y;
			y = temp;
		}
		sc.nextLine();
		System.out.print("가감승제를 입력하세요: ");
		String s = sc.nextLine();

		long result = switch (s) {
		case "+" -> math.add(x, y);
		case "-" -> math.sub(x, y);
		case "*" -> math.multi(x, y);
		case "%" -> math.div(x, y);
		default -> throw new IllegalArgumentException("Unexpected value: " + s);
		};

		System.out.println(result);

	}
}
