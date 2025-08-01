package ch04;

public class PersonDemo {
	public static void main(String[] args) {
		Person p = new Person();
//		p.setAge(21);
//		p.setName("min");
//		p.setNationality("Korea");
//
//		p.sayHello();
		p.setAge(21).setName("min").setNationality("Korea");
		p.sayHello();
	}
}

class Person {
	private String name;
	private int age;
	private String nationality;

	public Person setName(String name) {
		this.name = name;
		return this;
	}

	public Person setAge(int age) {
		this.age = age;
		return this;
	}

	public Person setNationality(String nationality) {
		this.nationality = nationality;
		return this;
	}

	public void sayHello() {
		System.out.println("born in: " + nationality + ", name: " + name + " " + age + "years old");
	}
}