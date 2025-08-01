package ch03;

public class MyMath {
	long add(long a, long b) {
		long total = 0;
		total = a + b;
		return total;
	}

	long sub(long a, long b) {
		long total = 0;
		total = a - b;
		return total;
	}

	long multi(long a, long b) {
		long total = 0;
		total = a * b;
		return total;
	}

	long div(long a, long b) {
		long total = 0;
		if (b != 0) {
			total = a / b;
		}
		return total;
	}

}
