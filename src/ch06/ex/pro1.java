package ch06.ex;

public class pro1 {
	public static void main(String[] args) {
		Circle c = new Circle(5);
		ColoredCircle cc = new ColoredCircle(10, "Red");

		c.show();
		cc.show();
	}
}

class Circle {
	int radius;

	void show() {
		System.out.println(radius + " radius circle");
	}

	public Circle(int radius) {
		this.radius = radius;
	}
}

class ColoredCircle extends Circle {
	String color;

	@Override
	void show() {
		System.out.println(radius + " radius, " + color + " color circle");
	}

	public ColoredCircle(int radius, String color) {
		super(radius);
		this.color = color;
	}
}