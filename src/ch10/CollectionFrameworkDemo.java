package ch10;

import java.util.ArrayList;

public class CollectionFrameworkDemo {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("grape");
		list.add("pink banana");
		list.add("dragon fruit");
		list.add("mango");

		// Consumer 인터페이스 구현체 람다식으로
		list.forEach(s -> System.out.print(s + ", "));
		System.out.println();
		list.removeIf(s -> s.startsWith("p")); // predicate 인터페이스의 구현체 람다식으로
		list.forEach(s -> System.out.print(s + ", "));
		System.out.println();

		ArrayList<Integer> iArr = new ArrayList<Integer>();
		iArr.add(-10);
		iArr.add(53);
		iArr.add(-34);
		iArr.add(15);
		iArr.removeIf(i -> i < 0);
		iArr.forEach(i -> System.out.println(i));

		ArrayList<Triangle> tArr = new ArrayList<Triangle>();
		tArr.add(new Triangle(3, 10));
		tArr.add(new Triangle(7, 6));
		tArr.add(new Triangle(4, 9));

		tArr.removeIf(tri -> tri.getArea() <= 20);
		tArr.forEach(tri -> System.out.println(tri.height + ", " + tri.bottom));

	}
}

class Triangle {
	int height;
	int bottom;

	public Triangle(int height, int bottom) {
		this.bottom = bottom;
		this.height = height;
	}

	public double getArea() {
		return height * bottom / 2;
	}
}