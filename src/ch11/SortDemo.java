package ch11;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SortDemo {
	public static void main(String[] args) {
		String[] fruits = { "포도", "수밧", "사과", "키위", "망고" };
		List<String> list = Arrays.asList(fruits);
		Set<String> set = Set.of("포도", "수밧", "사과", "키위", "망고");
		HashSet<String> hashset = new HashSet<String>(set);

//		Collections.sort(hashset);
//		list의 구현체만 sort 가능

		Collections.sort(list, Collections.reverseOrder()); // 사전 역순 정렬
		System.out.println(list);

		Collections.sort(list); // 리스트 순서 거꾸로
		System.out.println(list);
	}
}
