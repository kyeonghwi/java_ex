package ch03;

public class IncrementDemo2 {
	public static void main(String[] args) {
		ReferenceValue ref = new ReferenceValue();
		ref.x = 10;
		System.out.printf("main에서 increment 호출 전 x: %d\n", ref.x);
		increment(ref);
		System.out.printf("main에서 increment 호출 후 x: %d\n", ref.x);

	}

	public static void increment(ReferenceValue ref) {
		System.out.printf("main에서 increment 시작시 x: %d\n", ref.x);
		ref.x = 1000;
		System.out.printf("main에서 increment 종료시 x: %d\n", ref.x);
	}
}

class ReferenceValue {
	int x;
}