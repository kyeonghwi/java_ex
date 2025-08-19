package ch12;

public class Map2Demo {
	public static void main(String[] args) {
		Nation.nations.stream().map(n -> n.getName()).limit(4).forEach(Util::printWithParenthesis);
		System.out.println();

		Nation.nations.stream().mapToDouble(n -> n.getPopulation()).sorted().forEach(Util::printWithParenthesis);
		System.out.println();

		Nation.nations.stream().mapToInt(n -> n.getGdpRank()).sorted().forEach(Util::printWithParenthesis);
		System.out.println();

	}
}
