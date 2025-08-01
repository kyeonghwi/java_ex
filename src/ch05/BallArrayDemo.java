package ch05;

public class BallArrayDemo {
	public static void main(String[] args) {
		Ball[] arr = new Ball[5];
		arr[0] = new Ball("red");
		arr[1] = new Ball("yellow");
		for (Ball ball : arr) {
			System.out.println(ball);
		}
	}
}

class Ball {
	String color;

	public Ball(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return color;
	}
}