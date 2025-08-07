package ch06.sec02;

//import static ch04.sec07.NewCircle.method;

//import ch04.sec07.NewCircle;

public class InheritanceDemo {
	public static void main(String[] args) {
//		NewCircle c1 = new NewCircle();
//		method();
//		method();
//		method();

		Circle c1 = new Circle();
		Ball c2 = new Ball("Red");

		System.out.println("circle :");
		c1.findRadius();
		c1.findArea();

		System.out.println();
		System.out.println("ball: ");
		c2.findRadius();
		c2.findColor();
		c2.findArea();
		c2.findVolume();

		// 오버라이딩 불가
		// 1) private 오버라이딩 대상 아님
		// 2) static 메서드 오버라이딩 대상 아님
		// 3) final 메서드 수정 불가
	}
}
