package ch12;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class Optional1Demo {
	public static void main(String[] args) {
		OptionalDouble d = divide(3.0, 3);
		System.out.println(d);
		if (d.isPresent()) {
			System.out.println(d.getAsDouble());
		}

		OptionalDouble d1 = divide(3.0, 0.0);
		System.out.println(d1);
		if (d1.isEmpty()) {
			System.out.println("null");
		}

		d1.ifPresentOrElse(number -> System.out.println(number), () -> System.out.println("null"));

		OptionalInt i1 = divide(3, 3);
		System.out.println(i1);
		if (i1.isEmpty()) {
			System.out.println(i1.getAsInt());
		}

		i1.ifPresentOrElse(System.out::println, () -> System.out.println("null"));

		Optional<String> s = Optional.ofNullable("apple");
		Optional<String> s1 = Optional.ofNullable(null);

		System.out.println(s);

		s.ifPresentOrElse(System.out::println, System.out::println);
		s1.ifPresentOrElse(System.out::println, System.out::println);
	}

	public static OptionalDouble divide(double x, double y) {
		return y == 0 ? OptionalDouble.empty() : OptionalDouble.of(x / y);
	}

	public static OptionalInt divide(int x, int y) {
		return y == 0 ? OptionalInt.empty() : OptionalInt.of(x / y);
	}
}
