package ch05;

public class IncrementDemo {
	public static void main(String[] args) {
		int[] x = { 0 };
		System.out.println("함수 호출 전 x[0]" + x[0]);
		increment(x);
		System.out.println("함수 호출 전 x[0]" + x[0]);
	}

	public static void increment(int[] n) {
		System.out.println("start increment method: " + n[0]);
		n[0]++;
		System.out.println("end increment method: " + n[0]);

	}
}
