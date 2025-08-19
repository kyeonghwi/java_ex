package ch12;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDemo {
	public static void main(String[] args) {
		Stream<Nation> ns = Nation.nations.stream();

		Double collect = ns.collect(Collectors.averagingDouble(n -> n.getPopulation()));
		System.out.println("popluation avg : " + collect);

		ns = Nation.nations.stream();
		Long collect2 = ns.collect(Collectors.counting());
		System.out.println("country count : " + collect2);

		ns = Nation.nations.stream();
		System.out.println(ns.map(n -> n.getName()).limit(4).collect(Collectors.joining("-")));

		ns = Nation.nations.stream();
		System.out.println(ns.collect(Collectors.mapping(Nation::getName, Collectors.joining("+"))));

		ns = Nation.nations.stream();
		Optional<Double> max = ns.map(Nation::getPopulation).collect(Collectors.maxBy(Double::compare));
		System.out.println("max Pop : " + max.get());
	}
}
