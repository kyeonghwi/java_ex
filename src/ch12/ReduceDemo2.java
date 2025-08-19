package ch12;

import java.util.DoubleSummaryStatistics;
import java.util.stream.Stream;

public class ReduceDemo2 {
	public static void main(String[] args) {
		// gdp 20위 이내 인구 합
		Stream<Nation> nationStream = Nation.nations.stream();

		System.out.println(nationStream.filter(n -> n.getGdpRank() < 20).map(n -> n.getPopulation()).reduce((double) 0,
				Double::sum));
		nationStream = Nation.nations.stream();
		nationStream.filter(n -> n.getGdpRank() < 20).map(n -> n.getPopulation()).forEach(Util::print);
		System.out.println();
		// 섬 인구 합
		nationStream = Nation.nations.stream();
		System.out.println(
				nationStream.filter(n -> n.isIsland()).map(n -> n.getPopulation()).reduce((double) 0, Double::sum));
		nationStream = Nation.nations.stream();
		nationStream.filter(n -> n.isIsland()).map(n -> n.getPopulation()).forEach(Util::print);
		System.out.println();

		nationStream = Nation.nations.stream();
		DoubleSummaryStatistics ss = nationStream.mapToDouble(Nation::getPopulation).summaryStatistics();
		System.out.println(ss);
	}
}
