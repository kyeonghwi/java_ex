package ch08.ex;

public class Pro2 {
	public static void main(String[] args) {
		System.out.println(new Student("kim sagat"));
		System.out.println(new Student("hong gildong"));
	}
}

class Student {
	String name;

	public Student(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("Student [%s]", name);
	}
}