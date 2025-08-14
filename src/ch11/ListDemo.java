package ch11;

import java.util.Arrays;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		String[] animal = { "deer", "tiger", "sealion", "bear" }; // add,remove(X) set(O)
		List<String> animal2 = Arrays.asList(animal);

		animal2.set(0, "parrot");
		for (int i = 0; i < animal2.size(); i++) {
			System.out.println(animal2.get(i));
		}

//		animal2.add("parrot"); collection add()
//		animal2.add(1, "parrot"); list add() 

		animal2.sort((o1, o2) -> o1.length() - o2.length());
		for (String string : animal2) {
			System.out.println(string);
		}

		List<Integer> numbers = List.of(1, 2, 3, 4, 5); // immutable
//		numbers.set(0, 10);
//		numbers.sort((o1, o2) -> o1 - o2);

	}
}
