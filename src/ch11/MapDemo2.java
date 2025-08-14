package ch11;

import java.util.HashMap;
import java.util.Map;

public class MapDemo2 {
	public static void main(String[] args) {
		Map<Fruit, Integer> fruits = new HashMap<>();

		fruits.put(new Fruit("apple"), 3);
		fruits.put(new Fruit("banana"), 5);
		fruits.put(new Fruit("kiwi"), 10);
		fruits.put(new Fruit("kiwi"), 7);

		System.out.println(fruits.size());
		System.out.println(fruits.keySet());
		System.out.println(fruits.values());

		System.out.println(fruits.containsKey("banana"));

		fruits.forEach((x, y) -> System.out.println(x + " " + y));
	}
}

class Fruit {
	String name;

	@Override
	public String toString() {
		return name;
	}

	public Fruit(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj instanceof Fruit f) {
//			return this.name.equals(f.name); // name 비교해도 hashcode 오버라이드
			return this.hashCode() == f.hashCode();
		}
		return false;
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}
}