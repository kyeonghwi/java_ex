package ch06;

public class Person {
	String name = "saram";

	void whoAmI() {
		System.out.println("i am human");
	}

	void work() {
		System.out.println("work method");
	}
}

class Student extends Person {
	int number = 3;

	@Override
	void work() {
		System.out.println("study");
	}
}

class Employee extends Person {
	int salary = 100;

	@Override
	void work() {
		System.out.println("work");
	}
}

class SportsPlayer extends Person {
	String sports = "baseball";

	@Override
	void work() {
		System.out.println("train");
	}
}

class Entertainer extends Person {
	String type = "singer";

	@Override
	void work() {
		System.out.println("sing");
	}
}