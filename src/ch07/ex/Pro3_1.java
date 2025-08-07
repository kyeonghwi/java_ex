package ch07.ex;

public class Pro3_1 {
	public static void main(String[] args) {
		Line l1 = new Line(10);
		Line l2 = new Line(100);
		Line l3 = new Line(20);

		System.out.println(l1.equals(l2));

		int result = l1.compareTo(l2);
		if (result > 0) {
			System.out.println(l1 + " longer");
		} else if (result < 0) {
			System.out.println(l2 + " longer");
		} else {
			System.out.println("same");
		}
	}
}

class Line implements Comparable {
	int length;

	public Line(int length) {
		this.length = length;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Line line) {
			return this.length == line.length;
		}
		return false;
	}

	@Override
	public int compareTo(Object obj) {
		int result = 0;
		if (obj instanceof Line line) {
			result = (this.length - line.length);
		}
		return result;
	}

	@Override
	public String toString() {
		return String.format("Line [length = %d]", length);
	}
}
