package DataStructure;

public class ListQueue<E> {
	private Node<E> front;
	private Node<E> rear;
	private int size;

	public ListQueue() {
		front = rear = null;
		size = 0;
	}

	public void offer(E item) {
		Node<E> newNode = new Node<>(item, null);
		if (isEmpty()) {
			front = rear = newNode;
		} else {
			rear.next = newNode;
			rear = newNode;
		}
		size++;
	}

	public E poll() {
		if (isEmpty()) {
			return null;
		}
		Node<E> removedNode = front;
		front = front.next;
		removedNode.next = null;
		if (size == 1) {
			front = null;
		}
		size--;
		return removedNode.item;
	}

	public E peek() {
		if (isEmpty()) {
			return null;
		}
		return front.item;
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
		for (Node<E> n = front; n != null; n = n.next) {
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
