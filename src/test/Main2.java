package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main2 {

	public static void main(String[] args) {
		Stream<Integer> myIntStream = Stream.of(2, 9, 3, 8);
		IntSummaryStatistics stats = myIntStream.collect(Collectors.summarizingInt(x -> x.intValue()));
		System.out.println("Min: " + stats.getMin());
		System.out.println("Max: " + stats.getMax());
	}

	public void exampleExtractList() {
		House casa = new House(145);
		List<House> casas = new ArrayList<>();
		casas.add(new House(145));
		casas.add(new House(12));
		casas.add(new House(50));
		casas.add(new House(3));

		casas.stream()
				// .filter(x -> x.getSize() < 40)
				.map(x -> x.getSize()).collect(Collectors.toList()).forEach(x -> System.out.println(x));
	}

}
