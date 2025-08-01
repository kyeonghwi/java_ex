package ch02;

public class IncreaseDemo {
	public static void main(String[] args) {
		int j = 0, i = 3;
		j = i++;
		System.out.printf("%d, %d \n", j, i);

		for (int a = 0; a <= 10; a++) {
			for (int b = 0; b <= 10 - a; b++) {
				System.out.print(" ");
			}
			for (int c = 0; c < a * 2 - 1; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
