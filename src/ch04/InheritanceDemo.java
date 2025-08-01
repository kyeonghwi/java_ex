package ch04;

public class InheritanceDemo {
	public static void main(String[] args) {
		Animal ani = new Animal();
		ani.eat();

		Fish fish = new Fish();
		fish.move();

		Bird bird = new Bird();
		bird.move();
	}
}

class Animal {
	String mouth;

	void eat() {
		System.out.println("eat");
	}

	void move() {
		System.out.println("move");
	}
}

class Tiger extends Animal {
	@Override
	void move() {
		System.out.println("run");
	}
}

class Fish extends Animal {
	@Override
	void move() {
		System.out.println("swim");
	}
}

class Bird extends Animal {
	@Override
	void move() {
		System.out.println("fly");
	}
}