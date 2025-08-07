package ch07.ex;

public class Pro6 {
	public static void main(String[] args) {
		Human.echo();
		Student s = new Student(20);
		s.print();
		s.eat();
		Human p = new Worker();
		p.print();
		p.eat();
	}
}

interface Human {
	void eat();

	void print();

	static void echo() {
		System.out.println("yaho");
	}
}

class Worker implements Human {

	@Override
	public void eat() {
		System.out.println("eat bread");
	}

	@Override
	public void print() {
		System.out.println("human");
	}
}

class Student implements Human {
	int age;

	public Student(int age) {
		this.age = age;
	}

	@Override
	public void eat() {
		System.out.println("eating dosirak");
	}

	@Override
	public void print() {
		System.out.println(age + " years old student");
	}

}