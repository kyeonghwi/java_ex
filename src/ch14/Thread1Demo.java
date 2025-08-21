package ch14;

public class Thread1Demo {
	public static void main(String[] args) {
		// Runnable interface 구현체 작성,활용
		Thread thread = new Thread(new MyRunnable());
		thread.start();

		Thread thread1 = new Thread(new MyRunnable());
		thread1.start();

		System.out.print(Thread.currentThread().getName() + " Thread --> ");
		System.out.println("main hello");
	}
}

//작업할 내용
class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.print(Thread.currentThread().getName() + " Thread --> ");
		System.out.println("hello");
	}

}