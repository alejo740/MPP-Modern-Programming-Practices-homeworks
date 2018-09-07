package edu.mum.cs.cs401.labs.lab09.problem7.partB;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee("Joe", "Davis", 120000), new Employee("John", "Sims", 110000),
				new Employee("Joe", "Stevens", 200000), new Employee("Andrew", "Reardon", 80000),
				new Employee("Joe", "Cummings", 760000), new Employee("Steven", "Walters", 135000),
				new Employee("Thomas", "Blake", 111000), new Employee("Alice", "Richards", 101000),
				new Employee("Donald", "Trump", 100000));

		// your stream pipeline here
		// list, salaryLimit, letter, splitCharacter		
		String result = LambdaLibrary.EMPLOYEE_NAMES.apply(list, 100000, 'M', ", ");

		System.out.println(result);

		/**
		 * 
		 * int var1 = 'M'; System.out.println(var1);
		 * 
		 * Z = 90 z = 122
		 * 
		 * m = 109 M = 77
		 */
	}

}
