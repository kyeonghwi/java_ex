package ch01;

public class Hello {
	/**
	 * 프로그램 기본 메소드
	 * 
	 * @param args 분자 배열
	 */
	public static void main(String[] args) {
//		나의 첫 프로그램 
		int x = 0;
		int y = 3;
		int result = x + y;
		x = 10;

		System.out.println(result);
		for (int i = 0; i <= 10; i = i + 2) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 10; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
