package edu.mum.cs.cs401.labs.lab08.problem5;

import java.util.Arrays;
import java.util.List;

public class ForEachExample {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", "Away", "On Vacation",
				"Everywhere you want to be");

		list.forEach(x -> System.out.println(x.toUpperCase()));
		System.out.println("--------");
		list.forEach(ForEachExample::toUpperCase);//Class::staticMethod
	}

	public static void toUpperCase(String value) {
		System.out.println(value.toUpperCase());
	}

	// implement a Consumer

}