package edu.mum.cs.cs401.labs.lab09.problem8;

import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class LambdaLibrary {
	
	public static final TriFunction<List<Employee>, Integer, Character, Long> COUNT_EMPLOYEES_BY_SALARY = (list, salaryLimit, firstCharacterName) -> list.stream()
			.filter(x -> x.getSalary() > salaryLimit)
			.filter(x -> x.getLastName().charAt(0) > firstCharacterName)
			.count();
			
	public static final TriFunction<List<Employee>, Integer, Character, List<String>> LIST_EMPLOYEES_BY_SALARY = (list, salaryLimit, firstCharacterName) -> list.stream()
			.filter(x -> x.getSalary() > salaryLimit)
			.filter(x -> x.getFirstName().charAt(0) < firstCharacterName)
			.map(x -> x.getFullName().toUpperCase())
			.collect(Collectors.toList());
}
