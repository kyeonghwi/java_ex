package ch05;

public class ArgumentsDemo {
	public static void main(String[] args) {
//		System.out.println(args.length);
//		System.out.println(args[0]);
//		System.out.println(args[1]);
		int cnt = Integer.parseInt(args[1]);
		System.out.println(args[0] + cnt);

	}

	public static void inrement(String msg, int cnt) {
		for (int i = 0; i < cnt; i++) {
			System.out.println(msg);
		}
	}
}
