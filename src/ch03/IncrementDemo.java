package ch03;

public class IncrementDemo {
	public static void main(String[] args) {
		int x = 0;
		System.out.printf("main에서 increment 호출 전 x: %d\n", x);
		increment(x);
		System.out.printf("main에서 increment 호출 후 x: %d\n", x);

	}

	public static void increment(int n) {
		System.out.printf("main에서 increment 시작시 x: %d\n", n);
		n++;
		System.out.printf("main에서 increment 종료시 x: %d\n", n);
	}
}
