package ch10;

import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SuppplierDemo {
	public static void main(String[] args) {
		Supplier<String> s = () -> new String("Hello");
		System.out.println(s.get());

		DoubleSupplier ds = () -> Math.random();
		System.out.println(ds.getAsDouble());

		IntSupplier is = () -> (int) (Math.random() * 100);
		System.out.println(is.getAsInt());

	}
}
