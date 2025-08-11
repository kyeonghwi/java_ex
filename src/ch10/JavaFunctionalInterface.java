package ch10;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class JavaFunctionalInterface {
	public static void main(String[] args) {
//		FunctionalInterface 
//		Runnable(void run()), 
//		Supplier(T get()),
//		Consumer(void accept(T t)),
//		Function(R apply(T t)),
//		Predicate(boolean test(T t))

		Predicate<String> isEmptyStr = new Predicate<String>() {

			@Override
			public boolean test(String t) {
				if (t.length() == 0) {
					return true;
				}
				return false;
			}
		};

		System.out.println(isEmptyStr.test("Hello"));
		System.out.println(isEmptyStr.test(""));
		// System.out.println(isEmptyStr.test(null));

		Predicate<String> isEmpty = (t) -> (t != null && t.equals("") ? true : false);

		System.out.println(isEmpty.test("hello"));
		System.out.println(isEmpty.test(""));
		System.out.println(isEmpty.test(null));

		Consumer<String> printString = s -> System.out.println(s);
		printString.accept("hello");

	}
}
