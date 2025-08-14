package ch11.ex;

import java.util.HashMap;
import java.util.Map;

public class Pro7 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);

		String name = "";
		int maxScore = 0;
		int minScore = 100;
		double sum = 0;

		for (Integer integer : map.values()) {
			if (maxScore < integer) {
				maxScore = integer;
			}
			if (minScore > integer) {
				minScore = integer;
			}
			sum += integer;
		}

		System.out.println(getKey(map, maxScore));
		System.out.println(getKey(map, minScore));
		System.out.println(sum / map.size());

	}

	private static String getKey(Map<String, Integer> map, int maxScore) {
		for (String key : map.keySet()) {
			if (maxScore == map.get(key)) {
				return key;
			}
		}
		return null;
	}
}
