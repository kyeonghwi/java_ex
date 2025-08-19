package ch12.ex;

import java.util.List;
import java.util.stream.Stream;

public class Pro4 {
	public static void main(String[] args) {
		List<String> list = List.of("Seoul", "Washington", "Beijing", "Madrid", "Paris", "London");
		Stream<String> ls = list.stream();
		System.out.println(ls.sorted().findFirst().get());
	}
}
