package ch12.ex;

import java.util.List;
import java.util.stream.Stream;

import ch12.Util;

public class Pro3 {
	public static void main(String[] args) {
		List<String> list = List.of("seagull", "butterfly", "squirrel", "lama");
		Stream<String> ls = list.stream();
		ls.filter(n -> n.length() == 8).forEach(Util::print);
	}
}
