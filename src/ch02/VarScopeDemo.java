package ch02;

public class VarScopeDemo {

	public static void main(String[] args) {
		int var1 = 10;
		if (true) {
			System.out.println("if-->" + var1);
//			int var2 = 20;
		}
		for (int i = 0; i < 2; i++) {
			int var3 = 30;
			System.out.println("for -->" + var1++);
			System.out.println("for -->" + ++var3);
		}
		System.out.println("main -->" + var1++);

	}

}
