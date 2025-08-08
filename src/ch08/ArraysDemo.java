package ch08;

import java.util.Arrays;

public class ArraysDemo {
	public static void main(String[] args) {
		String[] sArr = { "cake", "apple", "donut", "banana" };
		Integer[] iArr = { 3, 5, 1, 7, };
		Character[] cArr = { 'p', 'y', 't', 'h', 'o', 'n' };

		print(sArr);
		print(iArr);
		print(cArr);

		Arrays.sort(sArr);
		print(sArr);

		System.out.println(Arrays.binarySearch(sArr, "cake"));

	}

	static void print(Object[] oArr) {
		for (Object object : oArr) {
			System.out.print(object + ", ");
		}
		System.out.println();
	}
}
