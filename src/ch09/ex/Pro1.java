package ch09.ex;

public class Pro1 {
	public static void main(String[] args) {
		Box<Integer> i = new Box<>();
		i.set(Integer.valueOf(100));
		System.out.println(i.get());

		Box<String> s = new Box<>();
		s.set("good");
		System.out.println(s.get());

	}
}

class Box<K> {
	private K key;

	void set(K key) {
		this.key = key;
	}

	K get() {
		return key;
	}
}