package ch10;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) {
		IntPredicate even = x -> x % 2 == 0;
		System.out.println(even.test(5) ? "even" : "odd");
		System.out.println(even.test(4) ? "even" : "odd");

		BiPredicate<Integer, Integer> bp = (x, y) -> x > y;
		System.out.println(bp.test(3, 5) ? "first one bigger" : "second one bigger");

		Predicate<String> p = x -> x.equals("");
		System.out.println(p.test("hello") ? "empty" : "exist");
	}
}
