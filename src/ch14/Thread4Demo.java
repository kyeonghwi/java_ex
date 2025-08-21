package ch14;

public class Thread4Demo {
	public static void main(String[] args) {
		// Thread 익명 객체 작성, 활용
		new Thread() {
			@Override
			public void run() {
				System.out.print(Thread.currentThread().getName() + " Thread --> ");
				System.out.println("main hello");
			}
		}.start();

		Thread thread1 = new WorkerThread();
		thread1.start();

		System.out.print(Thread.currentThread().getName() + " Thread --> ");
		System.out.println("main hello");
	}
}