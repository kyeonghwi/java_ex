package ch02;

public class ArithmeticDemo {
	public static void main(String[] args) {
		int i = 10;
		long l = 100L;

		long result = l + i;
		System.out.printf("%d and % d \nresult is %d\n", l, i, result);

		double d = 100.0;
		int i1 = 10;

		double res = d + i1;
		System.out.printf("%f and % d \nresult is %f \n", d, i1, res);

		long a = 1000000;
		int b = 2000000;

		long x = a * b;
		System.out.printf("%d and % d \nresult is %d \n", a, b, x);

		int apple = 1;
		double pieceUnit = 0.1;
		int num = 7;

		double total = apple - pieceUnit * num;
		System.out.println(total);
		System.out.println(3.14f + 1);

		// 나머지 연산 0, 0.0으로 나누기

//		int zero = 0;
		double zero1 = 0.0;
//		int res3 = 5 / zero;
		System.out.println(5 / zero1 + 100);
		System.out.println(5 % zero1 - 100);

		int res3 = 4 / 3;
		double res6 = 4 / (double) 3;
		System.out.println(res3 + " " + res6);

		int three = 3;
		int res4 = three % 2;
		System.out.println(res4);

		int four = 4;
		int res5 = four % 2;
		System.out.println(res5);
	}
}
