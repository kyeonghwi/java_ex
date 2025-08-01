package ch04.sec06;

public class CircleDemo {
	public static void main(String[] args) {
		Circle myCircle = new Circle();
		myCircle.setRadius(5);
		System.out.println(myCircle.getRadius());
		System.out.println(myCircle.findArea());
		myCircle.show();

		Circle c1 = new Circle(10);
		System.out.println(c1.getRadius());
		System.out.println(c1.findArea());
		c1.show();
	}
}
//
//class Circle {
//	double radius;
//
//	double findArea() {
//		return Math.PI * this.radius * radius;
//	}
//}

class Circle {
	// 필드
	private double radius;

	// 생성자
	public Circle() {

	}

	public Circle(double r) {
		if (r > 0) {
			this.radius = r;
		}
	}

	// Getter
	public double getRadius() {
		return radius;
	}

	// Setter
	public void setRadius(double r) {
		if (r <= 0) {
			System.out.println("imposible value");
			return;
		} else {
			this.radius = r;
		}
	}

	// Method
	double findArea() {
		return Math.PI * this.radius * radius;
	}

	void show() {
		System.out.printf("radius = %f, area = %f", getRadius(), findArea());
	}
}