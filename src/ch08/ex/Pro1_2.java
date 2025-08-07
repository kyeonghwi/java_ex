package ch08.ex;

import java.util.Objects;

public class Pro1_2 {
	public static void main(String[] args) {
		Person p1 = (new Person(1111, "honggildong"));
		Person p2 = (new Person(1111, "son"));
		Person p3 = (new Person(1234, "son"));

		if (p1.equals(p2)) {
			System.out.println("same");
		} else {
			System.out.println("diff");
		}

		if (p2.equals(p3)) {
			System.out.println("same");
		} else {
			System.out.println("diff");
		}
	}
}

class Person {
	int num;
	String name;

	public Person(int num, String name) {
		this.name = name;
		this.num = num;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			return hashCode() == obj.hashCode();
		}
		return false;
	}

	@Override
	public int hashCode() {
		return Objects.hash(num, name);
	}
}