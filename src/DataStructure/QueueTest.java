package DataStructure;

public class QueueTest {
	public static void main(String[] args) {
		ListQueue<Integer> lq = new ListQueue<>();

		lq.offer(10);
		lq.offer(20);
		lq.offer(30);
		System.out.println("Queue : " + lq);

		while (!lq.isEmpty()) {
			System.out.println(lq.peek());
			System.out.println(lq.poll());
		}
		System.out.println(lq.peek());
		System.out.println(lq.poll());

	}
}
