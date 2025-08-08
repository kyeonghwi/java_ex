package ch09.sec03;

import java.util.ArrayList;

public class GenericClassDemo2 {
	public static void main(String[] args) {
		Cup<Beer> beerCup = new Cup<>();

//		beerCup.setBeverage(new BarleyTea());

		beerCup.setBeverage(new Beer());
		Beer b = beerCup.getBeverage();

		Cup<BarleyTea> barleyTea = new Cup<>();

		barleyTea.setBeverage(new BarleyTea());
		BarleyTea b2 = barleyTea.getBeverage();
		b2.eat();

		ArrayList<Integer> intArr = new ArrayList<>();
		intArr.add(123);
		intArr.add(124);
		intArr.add(134);
		intArr.add(234);

		int i = intArr.get(0);
		System.out.println(i);

		ArrayList list = new ArrayList();
		list.add(10);
		list.add(10.0);
		list.add("Hello");
		list.add(new Beverage());
//		for (Object object : list) {
//			System.out.println(object);
//		}

		System.out.println(list);
		Integer i1 = (Integer) list.get(3);
	}
}

class Cup<T> {
	private T beverage;

	public T getBeverage() {
		return beverage;
	}

	public void setBeverage(T beverage) {
		this.beverage = beverage;
	}
}

class Beverage {

}

class Beer extends Beverage {
	void drink() {
		System.out.println("drink beer");
	}
}

class BarleyTea extends Beverage {
	void eat() {
		System.out.println("boricha");
	}
}