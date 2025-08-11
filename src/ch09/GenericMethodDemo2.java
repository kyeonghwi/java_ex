package ch09;

public class GenericMethodDemo2 {
	public static void main(String[] args) {
//		int[] iArr = { 1, 2, 3, 4, 5 };  배열 선언시 Wrapper Class 여야 함
//		showArray(iArr);
		Integer[] iArr = { 1, 2, 3, 4, 5, 6 };
		showArray(iArr);

		Double[] dArr = { 1.0, 2.0, 3.0, 4.0, 5.0, 6.0 };
		showArray(iArr);

		Character[] cArr = { 'a', 'b', 'c' };
//		showArray(cArr);
	}

	public static <T extends Number> void showArray(T[] arr) {
		for (T t : arr) {
			System.out.println(t);
		}
	}
}
