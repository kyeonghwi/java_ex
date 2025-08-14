package ch11;

import java.util.ArrayList;
import java.util.LinkedList;

public class PerformanceDemo {
	public static void main(String[] args) {
		ArrayList<Integer> aList = new ArrayList<Integer>();
		LinkedList<Integer> lList = new LinkedList<Integer>();

		long start = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			aList.add(i);
		}

		long end = System.nanoTime();
		System.out.println(end - start);

		start = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			lList.addLast(i);
		}

		end = System.nanoTime();
		System.out.println(end - start);

	}
}
