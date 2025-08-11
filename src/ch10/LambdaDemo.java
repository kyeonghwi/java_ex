package ch10;

public class LambdaDemo {
	public static void main(String[] args) {
//		(a, b) -> a> b ? a: b;
//		Object obj = new Object() {
//			int max(int a, int b) {
//				return a > b ? a : b;
//			}
//		};
//
//		int value = obj.max(2, 3);
//		
//		MyFunction f = new myFunction() {
//			@Override
//			public int max(int a, int b) {
//				return a > b ? a : b;
//			};
//		};
//		
		MyFunction f = (a, b) -> a > b ? a : b; // upcasting

		int value = f.max(3, 5);
		System.out.println(value);

		PrintFunction pf = (name, i) -> System.out.println(name + "=" + i);

		pf.printVar("hello", 3);

		SquareFunction sf = (x) -> x * x;

		System.out.println(sf.square(3));
		RollFunction rf = () -> (int) (Math.random() * 6) + 1;

		System.out.println(rf.roll());

		YourFunction yf = (int a, int b) -> (a > b ? b : a);
		System.out.println(yf.min(10, 9));
	}

}

//@FunctionalInterface
interface MyFunction {
	int max(int a, int b);
}

//class MyClass implements MyFunction {
//	int max(int a, int b) {
//		return a > b ? a : b;
//	}
//}

@FunctionalInterface
interface PrintFunction {
	void printVar(String name, int i);
}

@FunctionalInterface
interface SquareFunction {
	int square(int x);
}

@FunctionalInterface
interface RollFunction {
	int roll();
}

@FunctionalInterface
interface YourFunction {
	int min(int a, int b);
}