package ch11.ex;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Pro3 {
	public static void main(String[] args) {
		Map<String, Integer> map = new Hashtable<String, Integer>();

		map.put("김열공", 80);
		map.put("최고봉", 90);
		map.put("우등생", 95);
		map.put("나자바", 88);

		Scanner sc = new Scanner(System.in);
		System.out.print("input name: ");
		String name = sc.nextLine();
		System.out.println(map.get(name));
		sc.close();
	}
}
