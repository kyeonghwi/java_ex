package ch06.ex;

public class Pro3 {
	public static void main(String[] args) {
		Person[] pArr = new Person[3];
		pArr[0] = new Person("길동이", 22);
		pArr[1] = new Student("황진이", 23, 100);
		pArr[2] = new ForeignStudent("Diane", 30, 200, "U.S.A");

		for (Person person : pArr) {
			person.show();
		}
	}
}

class Person {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Person(String name, int age) {
		this.age = age;
		this.name = name;
	}

	void show() {
		System.out.printf("human [ name : %s, age : %d]\n", this.getName(), this.getAge());
	}
}

class Student extends Person {
	private int number;

	public int getNumber() {
		return number;
	}

	public Student(String name, int age, int number) {
		super(name, age);
		this.number = number;
	}

	@Override
	void show() {
		System.out.printf("human [ name : %s, age : %d, num : %d]\n", this.getName(), this.getAge(), this.getNumber());
	}
}

class ForeignStudent extends Student {
	private String nationality;

	public String getNationality() {
		return nationality;
	}

	public ForeignStudent(String name, int age, int number, String nationality) {
		super(name, age, number);
		this.nationality = nationality;
	}

	@Override
	void show() {
		System.out.printf("human [ name : %s, age : %d, num : %d, nationality : %s]\n", this.getName(), this.getAge(),
				this.getNumber(), this.getNationality());

	}
}