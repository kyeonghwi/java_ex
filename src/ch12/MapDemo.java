package ch12;

import java.util.stream.Stream;

public class MapDemo {
	public static void main(String[] args) {
		Stream<String> s1 = Stream.of("a1", "b1", "c1", "c2", "c3");
		Stream<String> mapOf = s1.map(s -> s.toUpperCase());
		mapOf.forEach(Util::print);
		System.out.println();

		Stream<Integer> intOf = Stream.of(1, 2, 2, 3, 4, 4, 5, 6, 7, 8);
		Stream<Integer> mapOf2 = intOf.map(n -> n * 2);
		mapOf2.forEach(Util::print);
		System.out.println();

		s1 = Stream.of("a1", "b1", "c1", "c2", "c3");
		s1.map(s -> s.substring(1)).mapToInt(s -> Integer.parseInt(s)).mapToObj(n -> n + "").forEach(Util::print);

	}
}
