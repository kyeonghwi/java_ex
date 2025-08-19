package ch12;

import java.util.Optional;

public class Optional2Demo {
	public static void main(String[] args) {
//		String s = "hello";
		String s = null;

		Optional<String> o = Optional.ofNullable(s);

		if (o.isPresent()) {
			Util.print(o.get());
		} else {
			String s1 = o.orElse("null");
			Util.print(s1);
		}

//		System.out.println(s1);
	}
}
