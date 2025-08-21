package DataStructure;

public class SLinkedListDemo {
	public static void main(String[] args) {
		SLinkedList<Integer> list = new SLinkedList<>();

		System.out.println(list.isEmpty());
		System.out.println(list.size());
		System.out.println(list);

		list.addFirst(30);
		list.addFirst(20);
		list.addFirst(10);
		list.add(0, 11);
		list.add(2, 22);
		list.add(5, 33);
		System.out.println(list);
		System.out.println(list.get(0));

		System.out.println(list);
		System.out.println(list.removeFirst());

		System.out.println(list);
		System.out.println(list.removeLast());

		System.out.println(list);
		System.out.println(list.removeLast());

	}
}
