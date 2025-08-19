package ch12;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FilterDemo {
	public static void main(String[] args) {
		Stream<String> of = Stream.of("a1", "b1", "c1", "c2", "c3");
		Stream<String> filterOf = of.filter(s -> s.startsWith("c"));
		Stream<String> skipOf = filterOf.skip(1);
		skipOf.forEach(Util::print);
		System.out.println();

		Stream.of("a1", "b1", "c1", "c2", "c3").skip(1).filter(s -> s.startsWith("c")).forEach(Util::print);
		System.out.println();

		IntStream intOf = IntStream.of(1, 2, 2, 3, 4, 4, 5, 6, 7, 8);
		IntStream oddOf = intOf.filter(num -> num % 2 == 0);
		IntStream distinctOf = oddOf.distinct();
		distinctOf.forEach(Util::printWithParenthesis);
		System.out.println();

		IntStream.of(1, 2, 2, 3, 4, 4, 5, 6, 7, 8).filter(num -> num % 2 == 0).distinct()
				.forEach(Util::printWithParenthesis);
		System.out.println();

//		List<Nation> nations = nations;
		System.out.print("population over 100M: ");
		Stream<Nation> nations = Nation.nations.stream();
		Stream<Nation> bigNation = nations.filter(n -> n.getPopulation() > 100.0);
		bigNation.limit(2).forEach(Util::printWithParenthesis);
		System.out.println();
	}
}
