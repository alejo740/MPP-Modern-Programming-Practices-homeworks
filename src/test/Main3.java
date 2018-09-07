package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main3 {

	public static void main(String[] args) {
		// .comparing(
		Stream<Integer> stream2 = Stream.iterate(1, n -> n + 1);
		// stream2.limit(10).collect(Collectors.toList()).forEach(System.out::println);

		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8));

		int result = list.stream().filter(x -> x < 5).reduce((a, b) -> a + b).get();
		System.out.println(result);

		BiPredicate<Integer, Integer> aa = (x, y) -> x > y;
		aa.test(1, 5);

		Predicate<Integer> bb = (x) -> x > 0;
		// comparator
		Stream.generate(() -> 1).limit(10).forEach(System.out::println);
		System.out.println("Finish");//range
		
		List<Integer> ints = Arrays.asList(1,2,3,4);
		List<int[]> intArrays = ints.stream().map(int[]::new).collect(Collectors.toList());
		
		List<String> intArraysString = intArrays.stream().map(Arrays::toString).collect(Collectors.toList());
		
		System.out.println(intArraysString);
		
		//IntSummaryStatistics.
		Stream<Integer> myIntStream = Stream.of(2, 9, 3, 8);
		IntSummaryStatistics stats = myIntStream.collect(Collectors.summarizingInt(x -> x.intValue()));
		System.out.println("Min: " + stats.getMin());
		System.out.println("Max: " + stats.getMax());
		
		//prime
		
		
		
		

	}
	
	public void mm() {
		throw new IllegalArgumentException("Input must be nonempty");
	}

}
