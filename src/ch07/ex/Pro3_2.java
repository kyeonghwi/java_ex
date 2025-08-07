package ch07.ex;

public class Pro3_2 {
	public static void main(String[] args) {
		Triangle t1 = new Triangle(5, 10);
		Triangle t2 = new Triangle(13, 9);

		int result = t1.compareTo(t2);
		if (result > 0) {
			System.out.println(t1);
		} else if (-99999 < result && result < 0) {
			System.out.println(t2);
		} else if (result == 0) {
			System.out.println("same");
		} else {
			System.out.println("error");
		}
	}
}

class Triangle implements Comparable<Triangle> {
	int width;
	int height;

	@Override
	public int compareTo(Triangle o) {
		if (o instanceof Triangle) {
			double diff = this.Area() - o.Area();
			if (diff > 0) {
				return 1;
			} else if (diff < 0) {
				return -1;
			} else {
				return 0;
			}
		}
		return -99999;
	}

	@Override
	public String toString() {
		return String.format("T=triangle[width = %d, height = %d, area = %.1f] is bigger", width, height, this.Area());
	}

	public double Area() {
		return this.height * this.width / 2.0;
	}

	public Triangle(int w, int h) {
		this.height = h;
		this.width = w;
	}
}