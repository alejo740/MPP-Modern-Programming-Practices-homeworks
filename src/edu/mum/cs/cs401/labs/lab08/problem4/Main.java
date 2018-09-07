package edu.mum.cs.cs401.labs.lab08.problem4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
	
	private TriFunction<Character, Character, Integer, Predicate<String>> triFunction = (c, d, l) -> (w -> w.contains(String.valueOf(c)) && !w.contains(String.valueOf(d)) && w.length() == l ); 

	//Version 1
	public int countWords1(List<String> words, char c, char d, int len) {
		return words.stream()
		.filter(x -> x.length() == len)
		.filter(x -> x.contains(String.valueOf(c)))
		.filter(x -> !x.contains(String.valueOf(d)))
		.collect(Collectors.toList())
		.size();
	}
	
	//Version 2 - Best
		public int countWords(List<String> words, char c, char d, int len) {
			return words.stream()
			.filter(triFunction.apply(c, d, len))
			.collect(Collectors.toList())
			.size();
		}

	public static void main(String[] args) {
		List<String> words = Arrays.asList("Edwin", "Leo", "David", "Ruben", "Carlos", "Salek", "Kindy", "Viviant");
		
		
		Main main = new Main();
		int result = main.countWords(words, 'd', 'o', 5);
		System.out.println(result);
	}

}
