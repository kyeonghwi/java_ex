package DataStructure;

public class PerformDemo {
	public static void main(String[] args) {
		int size = 100000000;
		int[] arr = new int[size];

		System.out.println(sample(arr, size));

		int[] arr2 = new int[10];
		sum(arr2, arr2.length);

		int[] arr3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		System.out.println(sequentialSearch(arr3.length, arr3, 8));

		int[][] arr4 = { { 1, 2, 3, 4, 5, 6 }, { 2, 3, 4, 5 }, { 3, 4, 5 } };
		System.out.println(sum2(arr4));
	}

	static int sample(int[] data, int n) {
		int k = n / 2;
		int cnt = data[k];
		System.out.print("count: ");
		return cnt;
	}

	static int sum(int[] data, int n) {
		int total = 0;
		for (int i = 0; i < n; i++) {
			total += i;
			System.out.println((i + 1) + " run");
		}
		return total;
	}

	static int sequentialSearch(int n, int[] data, int target) {
		for (int i = 0; i < n; i++) {
			System.out.println((i + 1) + " run");
			if (data[i] == target) {
				return i;
			}
		}
		return -1;
	}

	static int sum2(int[][] data) {
		int total = 0;
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				System.out.println((i + 1) + ", " + (j + 1) + " run");
				total += data[i][j];
			}
		}
		return total;
	}
}
