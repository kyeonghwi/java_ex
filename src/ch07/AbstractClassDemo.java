package ch07;

public class AbstractClassDemo {
	public static void main(String[] args) {
		// Shape shape = new Shape();

	}
}

abstract class Shape {
	double pi = 3.14;

	abstract void draw();

	public double findArea() {
		return pi * 1;
	}
}

class Circle extends Shape {
	int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	void draw() {
		System.out.println("draw circle");
	}

	@Override
	public double findArea() {
		return pi * radius * radius;
	}
}

class Triangle extends Shape {

	@Override
	void draw() {
		System.out.println("draw triangle");
	}
}