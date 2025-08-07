package ch06.sec02;

public class Circle {
	public static void staticMethod() {

	}

	private void secret() {
		System.out.println("secret");
	}

	protected void findRadius() {
		System.out.println("10cm radius");
	}

	public void findArea() {
		System.out.println("circlce area: (3.14*r*r)");
	}

	public final void findA() {
		System.out.println("circlce area: (3.14*r*r)");
	}
}