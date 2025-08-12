package ch10;

public class UseThisDemo {
	public static void main(String[] args) {
		new UseThisDemo().Lambda();
	}

	public void Lambda() {
		String hi = "Hi!";

		UseThis u1 = new UseThis() {
			@Override
			public void use() {
				System.out.println(this);
//				hi = hi + "lambda";
			}
		};

		u1.use();

		UseThis u2 = () -> {
			System.out.println(this);
		};
		u2.use();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "UseThisDemo";
	}
}

interface UseThis {
	void use();
}