package ch08;

import java.util.Objects;

public class ObjectMethodDemo {
	public static void main(String[] args) {
		Mouse m1 = new Mouse("Logitec", 35000);
		Mouse m2 = new Mouse("Logitec", 25000);
		Mouse m3 = m1;

		Keyboard k1 = new Keyboard("MS", 58000);
		Keyboard k2 = new Keyboard("MS", 58000);

		System.out.println(m1.toString());
		System.out.println(m1);

		System.out.println(k1.toString());
		System.out.println(k1);
		System.out.println(m1.equals(m2));
		System.out.println(m1.equals(m3));
		System.out.println(k1.equals(k2));
	}
}

class Keyboard {
	String name;
	int price;

	public Keyboard(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else {
			if (obj instanceof Keyboard k) {
				return this.hashCode() == k.hashCode();
			}
		}
		return false;
//		if (obj instanceof Keyboard k) {
//			if (name.equals(k.name) && price == k.price) {
//				return true;
//			}
//		}
//		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(name, price);
	}
}

class Mouse {
	String name;
	int price;

	public Mouse(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof Mouse m) {
			return this.hashCode() == m.hashCode();
		}
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(name, price);
	}
}