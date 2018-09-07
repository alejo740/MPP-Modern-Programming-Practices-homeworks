package edu.mum.cs.cs401.labs.lab11.problem5;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static int secondSmallest_1(List<Integer> list) {
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;

		for (int i : list) {
			if (i < smallest) {
				secondSmallest = smallest;
				smallest = i;
			} else if (i < secondSmallest) {
				secondSmallest = i;
			}
		}

		return secondSmallest;
	}

	/**
	 * Generic version 2 with stream and lambda expressions
	 */
	public static <T> T secondSmallest_2(List<T> list) {
		return list.stream().sorted().skip(1).findFirst().get();
	}
	
	/**
	 * Generic version 1 with Imperative way
	 */
	public static <T extends Comparable<? super T>> T secondSmallest(List<T> list) {
		
		T smallest = list.get(0);
		T secondSmallest = list.get(1);
		if (smallest.compareTo(secondSmallest) > 0) {
			T temp = smallest;
			smallest = secondSmallest;
			secondSmallest = temp;
		}
		
		for (T i : list) {
			if (i.compareTo(smallest) < 0) {
				secondSmallest = smallest;
				smallest = i;
			} else if (i.compareTo(secondSmallest) < 0) {
				secondSmallest = i;
			}
		}

		return secondSmallest;
	}

	public static void main(String[] args) {
		List<Integer> numbers1 = new ArrayList<>(); 
		numbers1.add(6);
		numbers1.add(16);
		numbers1.add(102);
		numbers1.add(88);
		numbers1.add(29);
		numbers1.add(15);

		List<Double> doubleElements = new ArrayList<>();
		doubleElements.add(0.5);
		doubleElements.add(6.84);
		doubleElements.add(14.3);
		doubleElements.add(1.5);
		
		List<String> stringElements = new ArrayList<>();
		stringElements.add("C");
		stringElements.add("O");
		stringElements.add("B");
		stringElements.add("O");
		stringElements.add("S");
		
		Instant start = Instant.now();
		System.out.println("Integer : " + secondSmallest(numbers1));
		System.out.println("Double : " + secondSmallest(doubleElements));
		System.out.println("Strings : " + secondSmallest(stringElements));
		Instant end = Instant.now();
		System.out.println("Generic imperative: "+Duration.between(start, end));
		
		
		start = Instant.now();
		System.out.println("Integer : " + secondSmallest_2(numbers1));
		System.out.println("Double : " + secondSmallest_2(doubleElements));
		System.out.println("Strings : " + secondSmallest_2(stringElements));
		end = Instant.now();
		System.out.println("Generic declarative: "+Duration.between(start, end));

	}

}
