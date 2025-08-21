package ch14;

public class Thread3Demo {
	public static void main(String[] args) {
		// Runnable 인터페이스 구현체 상속박은 Thread 작성,활용
		Thread thread = new WorkerThread();
		thread.start();

		Thread thread1 = new WorkerThread();
		thread1.start();

		System.out.print(Thread.currentThread().getName() + " Thread --> ");
		System.out.println("main hello");
	}
}

class WorkerThread extends Thread {
	@Override
	public void run() {
		System.out.print(Thread.currentThread().getName() + " Thread --> ");
		System.out.println("hello");
	}
}