package ch07;

public class ControllableDemo {
	public static void main(String[] args) {
		Tv tv = new Tv();
		tv.turnOn();
		tv.turnOff();
		tv.repair();
		tv.remoteOn();
		tv.remoteOff();

		Computer com = new Computer();
		com.turnOn();
		com.turnOff();
		com.repair();

		Controllable.reset();

		Notebook nb = new Notebook();
		nb.inMyBag();
		nb.turnOn();
		nb.turnOff();
	}
}
