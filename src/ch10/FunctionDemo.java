package ch10;

import java.util.function.Function;
import java.util.function.IntToDoubleFunction;

public class FunctionDemo {
	public static void main(String[] args) {
		Function<Integer, Integer> f = a -> a + 10;
		System.out.println(f.apply(10));

		IntToDoubleFunction idf = i -> 100 / i;
		System.out.println(idf.applyAsDouble(5));
	}
}
