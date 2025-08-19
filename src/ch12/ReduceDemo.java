package ch12;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ReduceDemo {
	public static void main(String[] args) {
		List<Integer> list1 = List.of(1, 4, 561);
		Stream<Integer> stream = list1.stream();
		Integer reduce = stream.reduce(0, (x, y) -> x + y);
		System.out.println(reduce);

		stream = list1.stream();
		Integer reduce_1 = stream.reduce(0, Integer::sum);
		System.out.println(reduce);

		stream = list1.stream();
		Optional<Integer> reduce_2 = stream.reduce((x, y) -> x + y);
		System.out.println(reduce_2.get());

		stream = list1.stream();
		Integer reduce2 = stream.reduce(1, (x, y) -> x * y);
		System.out.println(reduce2);
	}
}
