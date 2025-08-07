package ch06;

public class InheritanceDemo2 {
	public static void main(String[] args) {

	}
}

class A {
	String name;

	void method1() {
		System.out.println("A method");
	}
}

class B {
	String name;

	void method1() {
		System.out.println("B method");
	}
}

class C extends A { // 다중상속 허용X

}
//class C extends B {

//class A <----B
//class A <----C
//class A <----D

//class A <----C X
//class B <----C X