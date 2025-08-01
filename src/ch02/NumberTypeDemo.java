package ch02;

public class NumberTypeDemo {

	public static void main(String[] args) {

		int mach;
		int dist;
		mach = 340;
		dist = mach * 60 * 60;
		double radius;
		double area;
		System.out.println("소리가 한 시간 동안 가는 거리:" + dist + "m");

		radius = 10.0;
		area = radius * radius * 3.14;
		System.out.println("반지름이 " + radius + "인 원의 넓이는 " + area + "입니다.");

		char c = 'A';
		c = 'a';
		System.out.println(c);

		final double PI;
		PI = 3.14159;
		System.out.println(PI);

	}

}