package ch06.ex;

public class Pro2 {
	public static void main(String[] args) {
		Point p = new Point(0, 0);

		p.setX(1);
		p.setY(2);
		System.out.println(p.toString());

		MovablePoint m = new MovablePoint(p.getX(), p.getY(), 7, 8);
		m.setxSpeed(5);
		m.setySpeed(6);
		System.out.println(m.toString());
	}
}

class Point {
	private int x, y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class MovablePoint extends Point {
	private int xSpeed, ySpeed;
	Point p;

	@Override
	public String toString() {
		return "MovablePoint (" + p.getY() + "," + p.getY() + ") [xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + "]";
	}

	public int getxSpeed() {
		return xSpeed;
	}

	public void setxSpeed(int xSpeed) {
		this.xSpeed = xSpeed;
	}

	public int getySpeed() {
		return ySpeed;
	}

	public void setySpeed(int ySpeed) {
		this.ySpeed = ySpeed;
	}

	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		super(x, y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
}