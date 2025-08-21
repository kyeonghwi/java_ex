package ch14;

public class Thread0Demo {
	public static void main(String[] args) {
		// Runnable 인터페이스 익명 구현 객체
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.print(Thread.currentThread().getName() + " Thread --> ");
				System.out.println("hello");
			}
		});
		thread.start();

		System.out.print(Thread.currentThread().getName() + " Thread --> ");
		System.out.println("main hello");
	}
}
