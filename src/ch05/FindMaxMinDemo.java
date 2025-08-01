package ch05;

import java.util.Arrays;

public class FindMaxMinDemo {
	public static void main(String[] args) {
		int[] arr = { 3, 5, 1, 4, 2 };

		int min = arr[0];
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(min + ", " + max);

		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

	}
}
