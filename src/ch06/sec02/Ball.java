package ch06.sec02;

public class Ball extends Circle {
	private String color;

	public Ball(String color) {
		this.color = color;
	}

	public void findColor() {
		System.out.println(color + " color ball");
	}

	public void findVolume() {
		System.out.println("volume : (4/3*(3.14*r*r*r))");
	}

	@Override
	public void findArea() {
		// TODO Auto-generated method stub
		System.out.println("ball area: (4*3.14*r*r)");
	}
}
