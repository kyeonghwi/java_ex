package ch11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
	public static void main(String[] args) {
		Collection<String> list = Arrays.asList("fig", "banana", "musket");
//		list.add("apple");  고정크기
//		list.remove("fig"); 불변

		Collection<String> list1 = new ArrayList<>(Arrays.asList("fig", "banana", "musket"));
		list1.add("apple");
		list1.add("fig");
		System.out.println(list1.size());

		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		Iterator<String> iterator1 = list1.iterator();
		while (iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}

		list1.remove("fig");
		iterator1 = list1.iterator();
		while (iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
	}
}
