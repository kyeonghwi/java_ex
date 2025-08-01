package ch05;

public class StringDemo5 {
	public static void main(String[] args) {
		String version = String.format("%s \b %d", "JDK", 14);
		System.out.println(version);

		String fruits = String.join(", ", "apple", "banana", "cherry", "durian");
		System.out.println(fruits);

		String v1 = String.valueOf(false);
		String v2 = String.valueOf(10);
		String pi = String.valueOf(Math.PI);
		System.out.println(pi + 111111 + false + v1 + v2);
		System.out.println(3.14 + 111111);

//		Integer.pareInt(str);
//		Long.parseLong(str);
//		Double.parseDouble(str);

//		String html = "<html>\n" + "\t<body>\n" + "\t</body>\n" + "</html>\n";
//		System.out.println(html);

		String html2 = """
				<html>
					<body>
					</body>
				</html>
				""";
		System.out.println(html2);
	}
}
