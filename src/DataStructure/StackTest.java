package DataStructure;

import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {
		Stack<String> stk = new Stack<>();

		stk.push("A");
		stk.push("C");
		stk.push("V");
		stk.push("B");

		while (!stk.empty()) {
			System.out.println(stk.pop());
		}
	}
}
