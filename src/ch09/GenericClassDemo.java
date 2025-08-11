package ch09;

import ch06.sec02.Ball;

public class GenericClassDemo {
	public static void main(String[] args) {
		Cup c = new Cup();
		c.setBeverage(new Beer());
		Object o = c.getBeverage();
		Beer b = (Beer) o;
		b.drink();

		Cup c1 = new Cup();
		c1.setBeverage(new BarleyTea());
		c1.setBeverage(new Beer());
		c1.setBeverage(new Ball("red"));

		Object o1 = c1.getBeverage();
		if (o1 instanceof Beer b1) {
			b1.drink();
		} else if (o1 instanceof BarleyTea b2) {
			b2.eat();
		} else {
			System.out.println("ae dle eun ga ra");
		}

	}
}

class Cup {
	private Object beverage;

	public Object getBeverage() {
		return beverage;
	}

	public void setBeverage(Object beverage) {
		this.beverage = beverage;
	}

	@Override
	public String toString() {
		return "cup";
	}
}

class Beverage {
	@Override
	public String toString() {
		return "beverage";
	}
}

class Beer extends Beverage {
	void drink() {
		System.out.println("drink beer");
	}

	@Override
	public String toString() {
		return "beer";
	}
}

class BarleyTea extends Beverage {
	void eat() {
		System.out.println();
	}

	@Override
	public String toString() {
		return "boricha";
	}
}