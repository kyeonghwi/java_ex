package ch05.ex;

public class Ex3 {
	public static void main(String[] args) {
		double[][] interests = { { 3.2, 3.1, 3.2, 3.0 }, { 2.9, 2.8, 2.7, 2.6 }, { 2.7, 2.6, 2.5, 2.7 } };
		double[] sum1 = { 0.0, 0.0, 0.0 };
		double sum2 = 0.0;

		int i = 0;
		for (double[] d : interests) {
			for (double e : d) {
				sum1[i] += e;
			}
			System.out.printf("%d차년 평균 이자율 = %.2f%%\n", i + 1, sum1[i] / 4);
			sum2 += sum1[i] / 4;
			i++;
		}
		System.out.println(sum2);
	}
}
