package DataStructure;

import java.util.EmptyStackException;

public class ListStack<E> {
	private Node<E> top;
	private int size;

	public ListStack() {
		top = null;
		size = 0;
	}

	public void push(E item) {
		Node<E> newNode = new Node<>(item, top);
		top = newNode;
		size++;
	}

	public E pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		Node<E> removedNode = top;
		top = top.next;
		if (size == 1) {
			top = null;
		}
		size--;

		return removedNode.item;
	}

	public E peek() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return top.item;

	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public String toString() {
		String list = "[";
		for (Node<E> n = top; n != null; n = n.next) {
			if (n.next != null) {
				list += n.item + ",";
			} else {
				list += n.item;
			}
		}
		;
		return "LStack" + list + "]";
	}

	private class Node<E> {
		private E item;
		private Node<E> next;

		public Node(E item, Node<E> next) {
			super();
			this.item = item;
			this.next = next;
		}
	}
}
