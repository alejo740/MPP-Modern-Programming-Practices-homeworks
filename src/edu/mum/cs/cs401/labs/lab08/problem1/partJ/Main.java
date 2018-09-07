package edu.mum.cs.cs401.labs.lab08.problem1.partJ;

import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		Supplier<Double> supplier1 = Math::random;
		Supplier<Double> supplier2 = () -> Math.random();
		
		double result = supplier2.get();
		System.out.println(result);
		
	}

}
