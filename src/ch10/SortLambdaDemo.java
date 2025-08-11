package ch10;

import java.util.ArrayList;
import java.util.Collections;

public class SortLambdaDemo {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(3);
		arr.add(15);
		arr.add(13);

		Collections.sort(arr);
		System.out.println(arr);
		// 내림차순 정렬 = Comparator 구현
		// 숫자 비교 -> - 연산자
		Collections.sort(arr, (o1, o2) -> o2 - o1);

		System.out.println(arr);

		ArrayList<String> sArr = new ArrayList<>();
		sArr.add("s");
		sArr.add("c");
		sArr.add("W");
		sArr.add("a");

		Collections.sort(sArr);
		System.out.println(sArr);

		// 문자열 비교 ?
		Collections.sort(sArr, (s1, s2) -> s2.compareTo(s1));
		System.out.println(sArr);

		ArrayList<Line> lArr = new ArrayList<>();
		lArr.add(new Line(10));
		lArr.add(new Line(5));
		lArr.add(new Line(15));
		Collections.sort(lArr);
		lArr.stream().map(line -> line.length).forEach(line -> System.out.println(line));

		Collections.sort(lArr, (l1, l2) -> l2.compareTo(l1));
		lArr.stream().map(line -> line.length).forEach(line -> System.out.println(line));

	}
}

class Line implements Comparable<Line> {
	int length;

	@Override
	public int compareTo(Line l) {
		return this.length - l.length;
	}

	public Line(int length) {
		this.length = length;
	}

}