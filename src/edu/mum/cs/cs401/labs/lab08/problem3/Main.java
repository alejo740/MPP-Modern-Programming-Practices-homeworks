package edu.mum.cs.cs401.labs.lab08.problem3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Main {

	public static void main(String[] args) {
		BiFunction<Double, Double, List<Double>> function1 = (x, y) -> {
			List<Double> list = new ArrayList<>();
			list.add(Math.pow(x, y));
			list.add(x * y);
			return list;
		};
		
		List<Double> result = function1.apply(2.0, 3.0);
		System.out.println(result);
	}

}
