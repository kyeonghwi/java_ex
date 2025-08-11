package ch09;

import java.util.ArrayList;

public class GeniricInheritanceDemo {
	public static void main(String[] args) {
		ArrayList<Beverage> list1 = new ArrayList<>();
		list1.add(new Beverage());
		list1.add(new Beer());
		list1.add(new BarleyTea());

		beverageTest(list1);

		ArrayList<Beer> list2 = new ArrayList<>();
		list2.add(new Beer());
//		list2.add(new BarleyTea());
//		list2.add(new Beverage());

//		beverageTest(list2);
	}

	public static void beverageTest(ArrayList<Beverage> list) {
		System.out.println(list);
	}
}
