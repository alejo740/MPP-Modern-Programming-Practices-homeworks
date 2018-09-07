package edu.mum.cs.cs401.labs.lab09.problem6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BinaryOperator;

public class MainClass {

	public Set<String> union(List<Set<String>> sets) {
		Set<String> ss = new LinkedHashSet<>();

		BinaryOperator<Set<String>> func = (x, y) -> {
			x.addAll(y);
			return x;
		};

		return sets.stream().reduce(ss, func);

	}

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<>();
		set1.add("A");
		set1.add("B");

		Set<String> set2 = new HashSet<>();
		set2.add("D");

		Set<String> set3 = new HashSet<>();
		set3.add("1");
		set3.add("3");
		set3.add("5");

		List<Set<String>> list1 = new ArrayList<>();
		list1.add(set1);
		list1.add(set2);
		list1.add(set3);

		MainClass mainClass = new MainClass();
		Set<String> result = mainClass.union(list1);
		System.out.println(result);
	}

}
