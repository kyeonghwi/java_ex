package ch06;

public class InheritanceDemo {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.name = "parent";
		p.method1();

		Child c = new Child();
		c.name = "my parent";
		c.myName = "me";

		c.method1();
		c.method2();
	}
}

class Parent {
	String name;

	void method1() {
		System.out.println("method 1");
		System.out.println(name);
	}
}

class Child extends Parent {
	// 부모의 멤버
	// 자식의 멤버
	String myName;

	void method2() {
		System.out.println("method 2");
		System.out.println(myName);
	}
}