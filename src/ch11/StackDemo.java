package ch11;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		System.out.println(stack.empty());
		stack.push("apple");
		stack.push("banana");
		stack.push("cherry");

		System.out.println(stack.search("cherry"));
		System.out.println(stack.search("apple"));

		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}

		Stack<Integer> s2 = new Stack<Integer>();

		s2.add(10);
		s2.add(20);
		s2.add(0, 40); // 사용 가능 but push, pop 만
		while (!s2.isEmpty()) {
			System.out.println(s2.pop());
		}

	}
}
