package ch05.ex;

public class Pro2 {
	public static void main(String[] args) {
		System.out.println(sum(1, 2, 3, 4));
		int arr[] = { 2, 3 };
		System.out.println(sum(1, arr));
		System.out.println(sum(1, 2, 3, 4, 5));
	}

	static int sum(int j, int... num) {
		int total = 0;
		for (int i = 0; i < num.length; i++) {
			total += num[i];
		}
		return total;
	}
}
