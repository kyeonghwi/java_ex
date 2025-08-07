package ch06;

public class Vehicle {
	String name = "ride";

	void whoami() {
		System.out.println("i am vehicle");
	}

	static void move() {
		System.out.println("move");
	}
}

class OldCar extends Vehicle {
	String name = "car";

	@Override
	void whoami() {
		// TODO Auto-generated method stub
		System.out.println("i am a car");
	}

	static void move() {
		System.out.println("run");
	}
}

class SportsCar extends Vehicle {
	String name = "sports car";

	@Override
	void whoami() {
		// TODO Auto-generated method stub
		System.out.println("i am a sports car");
	}

	static void move() {
		System.out.println(" fast run");
	}
}