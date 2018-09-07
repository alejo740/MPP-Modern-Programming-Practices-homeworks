package edu.mum.cs.cs401.labs.lab11.problem1.partB;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		
		List<Double> ints = new ArrayList<>();
		ints.add(1.1);
		ints.add(2.1);
		
		List<? extends Number> nums = ints;
		
		/*
		 * The problem its here, because the nums it's a list of type <? extends Number> and this extends of List<?>, therefore
		 * the list cannot be modified, it's immutable. So, only null can be added to the list. 
		 */
		//nums.add(3.14);

	}

}
