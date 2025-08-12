package ch10;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerDemo {
	public static void main(String[] args) {
		Consumer<String> c1 = x -> System.out.println(x.toLowerCase());
		c1.accept("Hello jAVA");

		BiConsumer<String, String> bc = (x, y) -> System.out.println(x + " : " + y);
		bc.accept("hell", "o");

		IntConsumer c2 = i -> System.out.println(i * i - i);
		c2.accept(5);

		ObjIntConsumer<String> c3 = (s, i) -> System.out.println(s + i);
		c3.accept("ananas", 6);

	}
}
