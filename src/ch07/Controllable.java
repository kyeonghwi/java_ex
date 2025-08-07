package ch07;

/**
 * 저자제품 제어부 기능 포함, turnon, turnoff 존재 구현부 오버라이드해 사용
 * 
 * @param none
 * @return void
 */
public interface Controllable {

	void turnOn();

	void turnOff();

	default void repair() {
		show("repair");
	}

	private void show(String s) {
		System.out.println(s);
	}

	static void reset() {
		System.out.println("reset machine");
	}
}

interface Portable {
	void inMyBag();
}