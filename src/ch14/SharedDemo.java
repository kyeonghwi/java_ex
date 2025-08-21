package ch14;

import java.util.Random;

public class SharedDemo {
	public static void main(String[] args) {
		SharedCar car = new SharedCar();
		new CarThread("A", car, "busan").start();
		new CarThread("B", car, "seoul").start();
		new CarThread("C", car, "daejeon").start();
	}
}

class SharedCar {
	public synchronized void drive(String name, String destination) {
		System.out.println(name + " on car");
		Random r = new Random();
		for (int i = 0; i < r.nextInt(1, 3); i++) {
			System.out.println(name + " driving");
		}

		System.out.println(name + " arrived at " + destination);
	}
}

class CarThread extends Thread {
	private String who;
	private SharedCar car;
	private String destination;

	public CarThread(String who, SharedCar car, String destination) {
		this.who = who;
		this.car = car;
		this.destination = destination;
	}

	@Override
	public void run() {
		car.drive(who, destination);
	}

}