package DataStructure;

public class ListStackDmeo {
	public static void main(String[] args) {
		ListStack<Integer> stack = new ListStack<>();

		stack.push(1);
		stack.push(2);
		stack.push(3);

		System.out.println(stack);

		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
			System.out.println(stack);
		}
	}
}
