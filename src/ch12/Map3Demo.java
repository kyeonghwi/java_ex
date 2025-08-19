package ch12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Map3Demo {
	public static void main(String[] args) {
		List<String> list1 = List.of("hello java!", "good bye C++!");
		Stream<String> s1 = list1.stream();
		String[] split = "hello, java!".split(" ");
		Stream<String> s2 = Arrays.stream(split);
		s2.forEach(Util::printWithParenthesis);
		System.out.println();

		split = "good bye, C++!".split(" ");
		s2 = Arrays.stream(split);
		s2.forEach(Util::printWithParenthesis);
		System.out.println();

		Stream<String> flatMap = list1.stream().flatMap(s -> Arrays.stream(s.split(" ")));
		flatMap.forEach(Util::printWithParenthesis);
		System.out.println();

		List<String> list3 = List.of("hello, java!", "good bye, C++!", "hello, Python!");
		List<String> list2 = List.of("Good morning", "good afternoon", "good evening", "and good night");
		System.out.print("list element size: ");
		Stream<List<String>> listOf = Stream.of(list3);
		listOf = Stream.of(list2);
		listOf.forEach(l -> System.out.println(l.size()));

		Stream<List<String>> multiList = Stream.of(list1, list2, list3);
//		multiList.filter(l -> l.size() > 1).forEach(Util::print);
		multiList.flatMap(l -> {
			if (l.size() > 1) {
				return l.stream();
			} else {
				return Stream.empty();
			}
		}).forEach(Util::printWithParenthesis);
	}
}
