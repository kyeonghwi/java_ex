package ch05.ex;

import java.util.Arrays;

public class Pro4 {
	public static void main(String[] args) {
		String[] name = { "가위", "바위", "보" };
		System.out.println(name);
		System.out.println(Arrays.toString(name));
		for (int i = 0; i < 10; i++) {
			int n;
			n = (int) (Math.random() * 3);
			System.out.println(name[n]);
		}
	}
}
