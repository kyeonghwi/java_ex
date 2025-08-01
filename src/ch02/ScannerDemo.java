package ch02;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("input float value:");
		float a = sc.nextFloat();
		System.out.printf("input value: %f\n", a);

		System.out.print("input 실수 value:");
		double s = sc.nextDouble();
		System.out.printf("s+10 : %f\n", s + 10);

	}

}
