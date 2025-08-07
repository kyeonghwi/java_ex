package ch07;

public class AnimalDemo {
	public static void main(String[] args) {
		Dog d = new Dog();
		Cuckoo c = new Cuckoo();

		makeSound(d);
		makeSound(c);
	}

	private static void makeSound(Animal a) {
		a.sound();
	}
}

interface Animal {
	void sound();
}

class Dog implements Animal {
	@Override
	public void sound() {
		System.out.println("bow wow");
	}
}

class Cuckoo implements Animal {
	@Override
	public void sound() {
		System.out.println("cuckoo");
	}
}