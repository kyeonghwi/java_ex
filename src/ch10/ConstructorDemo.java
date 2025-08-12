package ch10;

public class ConstructorDemo {
	public static void main(String[] args) {
		NewObject<String> s = x -> new String(x);
		s = String::new;

		String str = s.getObject("apple");
		System.out.println(str);

		NewArray<Integer> a = i -> new Integer[i];
		a = Integer[]::new;

		Integer[] arr = a.getArray(3);
		System.out.println(arr.length);

		arr[0] = 3;
		arr[1] = 5;
		arr[2] = 6;

		for (Integer integer : arr) {
			System.out.println(integer);
		}

	}
}

interface NewObject<T> {
	T getObject(T t);
}

interface NewArray<T> {
	T[] getArray(int size);
}

class Box {
	String color;

	public Box(String color) {
		this.color = color;
	}
}