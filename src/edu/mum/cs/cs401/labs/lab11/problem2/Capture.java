package edu.mum.cs.cs401.labs.lab11.problem2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Capture {

	public static void reverse(List<?> list) {
		reverseHelper(list);
	}

	private static <T> void reverseHelper(List<T> list) {
		Collections.reverse(list);
	}

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Edwin", "Alejandro", "Cobos", "Fonseca");

		System.out.println(list);

		Capture.reverse(list);

		System.out.println(list);

	}

}
