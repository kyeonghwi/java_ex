package ch02;

public class CompLogicdemo {
	public static void main(String[] args) {
		int x = 0, y = 1;
		System.out.println(x < y && x == 0);
		System.out.println(x > y);

		// 쇼트 서킷 논리 && 1 false->2생략

		System.out.println(x > y && y / x == 0);
		// 쇼트 서킷 논리 || 1 true->2생략
		System.out.println(x < y || y / x == 0);
//		System.out.println(y / x == 0);

	}
}
