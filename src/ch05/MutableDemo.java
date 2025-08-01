package ch05;

public class MutableDemo {
	public static void main(String[] args) {
		Cat c1 = new Cat("Navi");
		Cat c2 = c1; // 객체 주소 공유

		System.out.println(c1 + ":" + c2);
		System.out.println(c1.getName());
		System.out.println(c2.getName());
		// c1.setName("way of water");
		c2 = new Cat("way of water");
		System.out.println(c1.getName());
		System.out.println(c2.getName());

		int i = 1; // 값 복사
		int j = i;

		System.out.println(i + " ," + j);
		i = 10;
		System.out.println(i + " ," + j);
	}
}

class Cat { // Mutable -> Immutable
	private final String name;

	public Cat(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}

}