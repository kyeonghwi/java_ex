package ch07;

public class Tv implements Controllable, RemoteControllable {

	@Override
	public void turnOn() {
		System.out.println("turn on tv");
	}

	@Override
	public void turnOff() {
		System.out.println("turn off tv");
	}

	@Override
	public void remoteOn() {
		System.out.println("remote on tv");
	}

	@Override
	public void remoteOff() {
		System.out.println("remote off tv");
	}
}

class Computer implements Controllable {

	@Override
	public void turnOn() {
		System.out.println("turn on computer");
	}

	@Override
	public void turnOff() {
		System.out.println("turn off computer");
	}

//	private void reapir() {
//		// TODO Auto-generated method stub
//
//	}

}

class Notebook extends Computer implements Portable {

	@Override
	public void inMyBag() {
		System.out.println("in my bag");
	}

	@Override
	public void turnOn() {
		System.out.println("turn on notebook");
	}

	@Override
	public void turnOff() {
		System.out.println("turn off laptop");
	}
}