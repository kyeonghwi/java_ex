package ch03;

public class SwitchDemo1 {
	public static void main(String[] args) {
//		int num = 1;
//		switch (num) {
//		case 3:
//			System.out.println("*");
//		case 2:
//			System.out.println("*");
//		case 1:
//			System.out.println("*");
//		default:
//			System.out.println("*");
//		}

		String day = "Mon";
		daycheck(day);
		System.out.println(daycheckReturn(day));
	}

	private static String daycheckReturn(String day) {

		String gubun = switch (day) {
		case "Mon", "Tue", "Wed", "Thu", "Fri" -> "weekday";
		case "Sat", "Sun" -> "weekend";
		default -> "??";
		};
		return gubun;
	}

	private static void daycheck(String day) {

		switch (day) {
		case "Mon", "Tue", "Wed", "Thu", "Fri" -> System.out.println("weekday");
		case "Sat", "Sun" -> System.out.println("weekend");
		default -> System.out.println();

		}
//		switch (day) {
//		case "Mon":
//		case "Tue":
//		case "Wed":
//		case "Thu":
//		case "Fri":
//			System.out.println("weekday");
//			break;
//		case "Sat":
//		case "Sun":
//			System.out.println("weekend");
//			break;
//
//		}
	}
}
