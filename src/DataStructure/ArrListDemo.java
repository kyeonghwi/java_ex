package DataStructure;

public class ArrListDemo {
	public static void main(String[] args) {
		ArrList<Integer> list = new ArrList<>();
		System.out.println("size: " + list.size());
		if (!list.isEmpty()) {
			System.out.println(list.get(0));
		}
		list.add(10);
		System.out.println("size: " + list.size());
		if (!list.isEmpty()) {
			System.out.println(list.get(0));
		}
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(list);
//
		list.add(1, 50);
		System.out.println(list);
//
		while (!list.isEmpty()) {
			System.out.println("before remove: " + list);
			Integer removed = list.remove(0);
			System.out.println(removed);
		}
		System.out.println(list);

//		list.get(3);
	}
}
