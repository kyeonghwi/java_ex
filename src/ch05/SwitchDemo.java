package ch05;

public class SwitchDemo {
	public static void main(String[] args) {
		Sex sex = Sex.Female;

		String s = switch (sex) {
		case Male -> "군머";
		case Female -> "병역의무X";
		default -> "??";
		};

		System.out.println(sex + s);
	}

}

enum Sex {
	Male, Female
}