package ch07.sec06;

public class MemberDemo {

	class Eagle extends Bird {
		@Override
		void move() {
			System.out.println("eagle fly");
		}

		void sound() {
			System.out.println("sound");
		}
	}

	Eagle e = new Eagle();

	public static void main(String[] args) {
		MemberDemo m = new MemberDemo();
		m.e.move();
		m.e.sound();

	}
}
