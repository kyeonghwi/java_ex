package ch11;

import java.util.ArrayList;
import java.util.List;

public class ArryListDemo {
	public static void main(String[] args) {
		List<String> list = List.of("grandeur", "sonata", "corolla", "genesis", "model y");

		List<String> car1 = new ArrayList<String>(list);
		car1.add("cybertruck");

		car1.add(0, "santafe");
		System.out.println(car1.toString());

		List<String> car2 = new ArrayList<String>(list);
		car2.remove("sonata");
		System.out.println(car2.toString());
		System.out.println(car2.contains("sonata"));

		System.out.println(car1.containsAll(car2));

		car1.removeIf(c -> c.startsWith("s"));
		System.out.println(car1);

		car1.replaceAll(c -> "new " + c);
		System.out.println(car1);

		car1.forEach(c -> System.out.println(c));

		car1.clear();
		System.out.println(car1.isEmpty());

	}
}
