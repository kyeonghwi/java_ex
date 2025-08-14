package ch12;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayToStreamDemo {
	public static void main(String[] args) {
		int[] ia = { 2, 3, 5, 7, 11, 13 };
		IntStream is = Arrays.stream(ia);

		String[] sa = { "a", "e", "f", "q" };
		Stream<String> sss = Arrays.stream(sa);
		Stream<String> ss = Stream.of(sa);

		double[] da = { 2.0, 3.0, 5.0, 7.0, 11.0, 13.0 };
		DoubleStream ds = DoubleStream.of(da);

		IntStream iis = IntStream.of(ia);

		Random r = new Random();
		IntStream ints = r.ints(0, 100);

		ints.limit(10).forEach(n -> System.out.println(n));

		IntStream iterate = IntStream.iterate(1, i -> i + 2);
		iterate.limit(3).forEach(n -> System.out.println(n));

		IntStream range = IntStream.range(1, 10);
		range.forEach(n -> System.out.println(n));

		IntStream range1 = IntStream.rangeClosed(1, 10);
		range1.forEach(n -> System.out.println(n));
	}
}
