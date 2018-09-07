package edu.mum.cs.cs401.labs.lab11.problem4.partA;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MainClass {

	public static double sum(Collection<? extends Number> nums) {
		double s = 0.0;

		for (Number num : nums)
			s += num.doubleValue();

		return s;
	}

	public static void main(String[] args) {

		List<Integer> ints = new ArrayList<>();
		ints.add(1);
		ints.add(2);

		List<? extends Number> nums = ints;
		double db1 = sum(nums);

		/**
		 * The error it's here because it's not possible to modify a wildcard List, it's immutable.
		 */
		//nums.add(3.14);

	}

}
