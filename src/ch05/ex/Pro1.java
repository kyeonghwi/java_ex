package ch05.ex;

public class Pro1 {
	public static void main(String[] args) {
		String s = "hello";
		char c = 'l';
		System.out.println(countChar(s, c));
	}

	static int countChar(String s, char c) {
		int cnt = 0;
//		s.toLowerCase();
//		c = Character.toLowerCase(c);
//		char[] arr = s.toCharArray();
//		for (char ch : arr) {
//			if (ch == c) {
//				cnt++;
//			}
//		}
		for (int i = 0; i < s.length(); i++) {
			if (s.toLowerCase().charAt(i) == c || s.toUpperCase().charAt(i) == c) {
				cnt++;
			}
		}

		return cnt;
	}
}
