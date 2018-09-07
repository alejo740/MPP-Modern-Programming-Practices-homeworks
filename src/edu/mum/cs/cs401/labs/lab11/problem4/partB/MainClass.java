package edu.mum.cs.cs401.labs.lab11.problem4.partB;

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
		
		List<Object> objs = new ArrayList<>();
		objs.add(1);
		objs.add("two");
		
		List<? super Integer> ints = objs;
		ints.add(3);
		
		
		/**
		 * The error it's here, because the sum method is expecting a type but not a Wildcard type 
		 */
		//double db1 = sum(objs);
	}

}
