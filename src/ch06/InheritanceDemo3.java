package ch06;

public class InheritanceDemo3 {
	public static void main(String[] args) {
		Animal a = new Animal();

		Eagle e = new Eagle();
		Tiger t = new Tiger();
		Marins m = new Marins();

		a.move();
		e.move();
		t.move();
		m.move();
	}
}

class Animal {
	String eye;
	String mouth;

	void eat() {
		System.out.println("eat");
	}

	void sleep() {
		System.out.println("sleep");
	}

	void move() {
		System.out.println("move");
	}
}

class Eagle extends Animal {
	String wing;

	@Override
	void move() {
		// TODO Auto-generated method stub
		System.out.println("eagle fly");
	}
//	void fly() {
//		System.out.println("fly");
//	}
}

class Tiger extends Animal {
	String leg;

//	void run() {
//		System.out.println("run");
//	}

	@Override
	void move() {
		// TODO Auto-generated method stub
		System.out.println("tiger run");
	}
}

class Marins extends Animal {
	String fin;

//	void swim() {
//		System.out.println("swim");
//	}
	@Override
	void move() {
		// TODO Auto-generated method stub
		System.out.println("marin swim");
	}
}