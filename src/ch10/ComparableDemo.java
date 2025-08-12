package ch10;

import java.util.Arrays;

public class ComparableDemo {
	public static void main(String[] args) {
		Rectangle[] rectangles = { new Rectangle(3, 5), new Rectangle(2, 10), new Rectangle(5, 5), };

		Arrays.sort(rectangles); // 기본 정렬 방식 정렬
//		Arrays.sort(rectangles, new Comparator<Rectangle>() {
//			@Override
//			public int compare(Rectangle o1, Rectangle o2) {
//				return o2.height - o1.height;
//			};
//		}); // 다른 방식 정렬

		Arrays.sort(rectangles, (o1, o2) -> o2.height - o1.height);
		System.out.println(Arrays.toString(rectangles));
	}
}

class Rectangle implements Comparable<Rectangle> {
	int width, height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("rectangle width= %d, height= %d ", width, height);
	}

	public int findArea() {
		return width * height;
	}

	@Override
	public int compareTo(Rectangle r) {
		// TODO Auto-generated method stub
		return this.findArea() - r.findArea();
	}

}