package ch12;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class SortedDemo {
	public static void main(String[] args) {
		List<String> list1 = List.of("Good morning", "good afternoon", "good evening", "and good night");
		list1.stream().sorted().forEach(Util::printWithParenthesis);
		System.out.println();
		Stream.of(3, 5, 1, 6, 8).sorted((x, y) -> y - x).forEach(Util::printWithParenthesis);
		System.out.println();

//		Nation.nations.stream().map(s -> s.getName()).sorted().forEach(Util::printWithParenthesis);
		Nation.nations.stream().sorted(Comparator.comparing(s -> s.getName())).forEach(Util::printWithParenthesis);
		System.out.println();

		Nation.nations.stream().sorted(Comparator.comparing(s -> s.getGdpRank()))
				.map(s -> s.getName() + " : " + s.getGdpRank()).forEach(Util::printWithParenthesis);
		System.out.println();

		Nation.nations.stream().sorted(Comparator.comparing(s -> ((Nation) s).getPopulation()).reversed())
				.map(s -> s.getName() + " : " + s.getPopulation()).forEach(Util::printWithParenthesis);
		System.out.println();

	}
}
