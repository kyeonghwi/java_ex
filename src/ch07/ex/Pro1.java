package ch07.ex;

public class Pro1 {
	public static void main(String[] args) {
		Concrete c = new Concrete(100, 50);
		c.show();
	}
}

abstract class Abstract {
	int i;

	abstract void show();

	public Abstract(int i) {
		this.i = i;
	}
}

class Concrete extends Abstract {
	int j;

	@Override
	void show() {
		System.out.println(i + ", " + j);
	}

	public Concrete(int i, int j) {
		super(i);
		this.j = j;
	}
}