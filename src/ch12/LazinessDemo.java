package ch12;

import java.util.stream.IntStream;

public class LazinessDemo {
	public static void main(String[] args) {
		IntStream is = IntStream.rangeClosed(1, 5); // 1,2,3,4,5

		is.filter(x -> x % 2 == 0).map(x -> x * x).forEach(System.out::println);

	}
}
