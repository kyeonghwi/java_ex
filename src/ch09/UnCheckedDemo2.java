package ch09;

public class UnCheckedDemo2 {
	public static void main(String[] args) {

		int number = 1;
		try {
			int res = 5 / number;
			String str = "";
			System.out.println(str.length());
			int[] Arr = new int[0]; // NullPointerException
			System.out.println(Arr[3]);
		} catch (ArithmeticException | NullPointerException e) {
			System.out.println("cannont divide by 0 or null string");
		} catch (Exception e) {
			System.out.println("unknown exception occured  ");
		}
	}
}
