package ch11.ex;

import java.util.HashMap;
import java.util.Map;

public class Pro5 {
	public static void main(String[] args) {
		Map<String, String> animal = new HashMap<>();
		animal.put("호랑이", "tiger");
		animal.put("표범", "leopard");
		animal.put("사자", "lion");

		System.out.println(animal);
		animal.replaceAll((x, y) -> y.toUpperCase());
		System.out.println(animal);
	}
}
