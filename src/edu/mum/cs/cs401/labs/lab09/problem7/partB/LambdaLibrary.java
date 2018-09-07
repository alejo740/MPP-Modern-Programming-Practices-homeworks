package edu.mum.cs.cs401.labs.lab09.problem7.partB;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {
	
	public static final QuadFunction<List<Employee>, Integer, Character, String, String> EMPLOYEE_NAMES = 
			(list, salaryLimit, firstCharacterName, splitString) -> list.stream()
			.filter(x -> x.getSalary() > salaryLimit)
			.filter(x -> x.getLastName().charAt(0) > firstCharacterName)
			.map(x -> x.getFirstName() + " " + x.getLastName())
			.sorted()
			.collect(Collectors.joining(splitString));
			
}
