package ch11;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class hashSetDemo {
	public static void main(String[] args) {
		Set<String> set = Set.of("grape", "watermelon", "apple", "kiwi", "mango");
		Set<String> fruits = new HashSet<String>(set);

		fruits.add(null);
		System.out.println(fruits);

		fruits.remove("apple");
		System.out.println(fruits);

		TreeSet<String> fruits2 = new TreeSet<String>(set);

		System.out.println(fruits2.higher("kiwi"));
	}
}
