package ch12;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LoopDemo {
	public static void main(String[] args) {
		Stream<Nation> nationStream = Nation.nations.stream();

		Stream<Nation> peek = nationStream.peek(Util::printWithParenthesis);
//		peek.filter(n -> n.isIsland()).forEach(Util::printWithParenthesis);
		peek.mapToDouble(n -> n.getPopulation()).forEach(Util::print);

		IntStream is = IntStream.of(1, 2, 3, 4, 5);
		OptionalInt min = is.min();
		System.out.println("\n min : " + min.getAsInt());

		is = IntStream.of(1, 2, 3, 4, 5);
		OptionalInt max = is.max();
		System.out.println("\n max : " + max.getAsInt());

		is = IntStream.of(1, 2, 3, 4, 5);
		OptionalDouble avg = is.average();
		System.out.println("\n acerage : " + avg.getAsDouble());

		is = IntStream.of(1, 2, 3, 4, 5);
		System.out.println("\n sum : " + is.sum());

	}
}
