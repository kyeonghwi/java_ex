package ch11;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> q = new LinkedList<String>();
		q.offer("A");
		q.offer("B");
		q.offer("C");
		q.offer("D");

		while (!q.isEmpty()) {
			System.out.println(q.poll());
		}

	}
}
