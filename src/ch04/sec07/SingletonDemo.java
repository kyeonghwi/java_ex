package ch04.sec07;

public class SingletonDemo {
	public static void main(String[] args) {
//		Singleton s = new Singleton;
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();

		System.out.println(s1);// object에 toString()에 의해 이름 출력
		System.out.println(s2);
		System.out.println(s3);
	}
}

class Singleton {
	// static var
	private static Singleton singleton = new Singleton();

	// constructor
	private Singleton() {

	}

	// static method
	public static Singleton getInstance() {
		return singleton;
	}
}