package ch02;

public class TypeCasting {

	public static void main(String[] args) {
		// 묵시적, 자동 형변환
		double d1 = 5 * 3.14; // 피연산자의 타입 자동변환
		double d2 = 1;
		System.out.println(d1 + " and " + d2);

		// 명시적, 강제 형변환
		float f = (float) 3.14;
		byte b = (byte) 300;
		double d = 3.14f + 1;
		System.out.println(f + " " + b + " " + d);

		// 숫자 문자로
		char c = 3 + '0'; // '0' : 48 +3 = 51
		int i = '3' - '0'; // '3' : 51-48 =3

		String s = 3 + "";
		String s1 = '3' + "";
		System.out.println(c + i + s + s1);

		System.out.println("\n" + s1.charAt(0));
		System.out.println("hello".charAt(1));
		System.out.println("안녕하세요".charAt(1));

		String str = "300";
		int value1 = Integer.parseInt(str);
		System.out.println(value1 + 1);

		str = "30000000000000000";
		long value2 = Long.parseLong(str);
		System.out.println(value2 + 1);

		str = "3.14";
		double value3 = Double.parseDouble(str);
		System.out.println(value3 + 1);

	}

}
