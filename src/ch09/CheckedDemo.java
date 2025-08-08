package ch09;

public class CheckedDemo {
	public static void main(String[] args) {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("interrupted exception occured");

		}
	}
}
