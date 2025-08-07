package ch07.ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pro3_4 {
	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person(40, 175, 68, "박지성"));
		persons.add(new Person(32, 170, 75, "홍길동"));
		persons.add(new Person(20, 180, 70, "손흥민"));
		persons.add(new Person(39, 178, 60, "최형우"));
		Collections.sort(persons);
		Collections.reverse(persons);
		for (Person person : persons) {
			System.out.println(person);
		}
	}
}

class Person implements Comparable<Person> {
	int age;
	int height;
	int weight;
	String name;

	public Person(int age, int height, int weight, String name) {
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.name = name;
	}

	@Override
	public int compareTo(Person o) {
		return this.age - o.age;
	}

	@Override
	public String toString() {
		return String.format("Person[name = %s, age = %d, height = %d, weight = %d]", name, age, height, weight);
	}
}