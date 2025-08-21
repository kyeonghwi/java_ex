package DataStructure;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
//		System.out.println(list.get(0));
//		System.out.println(list.remove(0));

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list);

		list.addFirst(3);
		list.addFirst(2);
		list.addFirst(1);
		System.out.println(list);

		list.addLast(100);

		System.out.println(list.getFirst());
		System.out.println(list.getLast());

		System.out.println(list.remove());
		System.out.println(list.removeFirst());
		System.out.println(list.removeLast());
	}
}
