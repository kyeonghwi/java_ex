package ch11;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class mapDemo {
	public static void main(String[] args) {
		Map<String, Integer> map = Map.of("apple", 5, "banana", 2, "grape", 10);
		Map<String, Integer> fruits = new HashMap<String, Integer>(map);

		fruits.put("apple", 3);
		fruits.put("strawberry", 6);
		fruits.put(null, null);
		System.out.println(fruits.size());
		System.out.println(fruits.keySet());
		System.out.println(fruits.values());
		Set<Map.Entry<String, Integer>> fruitsEntry = fruits.entrySet();

		for (Map.Entry<String, Integer> entry : fruitsEntry) {
//			entry.setValue(10);
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

		System.out.println(fruits.containsKey("banana"));

		fruits.forEach((x, y) -> System.out.println(x + " " + y));

		Map<String, Integer> fruitshashtable = new Hashtable<>(map);
//		fruitshashtable.add(null,null); null 불가 
	}
}
