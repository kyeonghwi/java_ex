package ch11.ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class Pro2 {
	public static void main(String[] args) {
		Set<Person> set = new HashSet<>();

		set.add(new Person("김열공", 20));
		set.add(new Person("김열공", 20));
		set.add(new Person("우등생", 16));
		set.add(new Person("우등생", 16));
		set.add(new Person("최고봉", 56));
		set.add(new Person("최고봉", 56));
		set.add(new Person("나자바", 35));
		set.add(new Person("나자바", 35));

		Iterator<Person> iterator = set.iterator();

		while (true) {
			if (iterator.hasNext()) {
				System.out.print(iterator.next() + " ");
			}
		}
	}
}

class Person {
	int age;
	String name;

	@Override
	public String toString() {
		return String.format("Person[%s : %d]", name, age);
	}

	public Person(String name, int age) {
		this.age = age;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj instanceof Person p) {
			return this.hashCode() == obj.hashCode();
		}
		return false;
	}
}