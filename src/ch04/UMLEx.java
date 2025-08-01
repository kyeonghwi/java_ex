package ch04;

public class UMLEx {
	public static void main(String[] args) {

	}
}

class Animal1 {
	int age;
	String Gender;

	void isMammal() {

	}

	void introduce(String s) {
		System.out.println("My name is " + s);
	}
}

class Duck extends Animal1 {
	String BeakColor = "yellow";

	void swim() {

	}

	void quak() {

	}
}

class Fish1 extends Animal1 {
	int sizeInFt;

	void swim() {

	}
}