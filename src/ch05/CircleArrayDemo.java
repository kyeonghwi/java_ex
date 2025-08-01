package ch05;

public class CircleArrayDemo {
	public static void main(String[] args) {
		Circle[] circles = new Circle[5];

		for (int i = 0; i < circles.length; i++) {
			circles[i] = new Circle(i + 1.0);
			System.out.println(circles[i]);
		}
	}
}

class Circle {
	double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	double findArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("area(radius:%.1f) = %.2f", radius, findArea());
	}
}