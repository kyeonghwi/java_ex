package ch12;

import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MatchDemo {
	public static void main(String[] args) {
		boolean anyMatch = Stream.of("a1", "b1", "c1").anyMatch(s -> s.startsWith("c"));
		System.out.println(anyMatch);

		boolean allMatch = IntStream.of(10, 20, 30, 40).allMatch(n -> n % 10 == 0);
		System.out.println(allMatch);

		boolean pop = Nation.nations.stream().map(s -> s.getPopulation()).allMatch(n -> n > 100);
		System.out.println(pop);
		boolean island = Nation.nations.stream().map(s -> s.isIsland()).anyMatch(s -> s.equals(true));
		System.out.println(island);
		boolean allMatch2 = Nation.nations.stream().map(s -> s.getName()).noneMatch(s -> s.equals("Japan"));
		System.out.println(allMatch2);

		System.out.println(Nation.nations.stream().filter(n -> n.isIsland()).findFirst());

		Optional<Nation> any = Nation.nations.stream().filter(n -> !n.isIsland()).findAny();
		any.ifPresentOrElse(Util::print, () -> System.out.println("no island"));

		Nation.nations.stream().filter(n -> n.getPopulation() > 100).map(n -> n.getGdpRank()).sorted().limit(1)
				.forEach(Util::printWithParenthesis);
	}
}
