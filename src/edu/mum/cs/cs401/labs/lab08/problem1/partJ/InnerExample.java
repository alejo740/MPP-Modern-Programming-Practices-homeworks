package edu.mum.cs.cs401.labs.lab08.problem1.partJ;

import java.util.function.Supplier;

public class InnerExample {

	class InnerSupplier implements Supplier<Double> {

		@Override
		public Double get() {
			return Math.random();
		}

	}

	public static void main(String[] args) {
		InnerExample innerExample = new InnerExample();
		Supplier<Double> supplier = innerExample.new InnerSupplier();

		Double result = supplier.get();
		System.out.println(result);
	}

}
