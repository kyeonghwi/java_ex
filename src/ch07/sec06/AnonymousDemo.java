package ch07.sec06;

public class AnonymousDemo {

	Bird b = new Bird() {
		@Override
		void move() {
			System.out.println("bird fly");
		};

		void sound() {
			System.out.println("anonymous sound ");
		}

	};

	public static void main(String[] args) {
		AnonymousDemo a = new AnonymousDemo();
		a.b.move();
	}
}
