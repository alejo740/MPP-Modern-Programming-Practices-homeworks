package edu.mum.cs.cs401.labs.lab09.problem3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;

public class EmployeeInfoBetter {
	static enum SortMethod {
		BYNAME, BYSALARY
	};

	private Function<Employee, String> byName = e -> e.getName();
	private Function<Employee, Integer> bySalary = e -> -e.getSalary();
	
	private HashMap<SortMethod, Pair<Function, Function>> sortMethods;

	public EmployeeInfoBetter() {
		sortMethods = new HashMap<>();
		sortMethods.put(SortMethod.BYNAME, new Pair<Function, Function>(byName, bySalary));
		sortMethods.put(SortMethod.BYSALARY, new Pair<Function, Function>(bySalary, byName));
	}

	public void sort(List<Employee> emps, final SortMethod method) {
		Function sort1 = sortMethods.get(method).attribute1;
		Function sort2 = sortMethods.get(method).attribute2;
		Collections.sort(emps, Comparator.comparing(sort1).thenComparing(sort2));
	}

	public static void main(String[] args) {

		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Joe", 100000));
		emps.add(new Employee("Tim", 50000));
		emps.add(new Employee("Rick", 50000));
		emps.add(new Employee("Andy", 60000));
		emps.add(new Employee("Tim", 70000));
		EmployeeInfoBetter ei = new EmployeeInfoBetter();
		ei.sort(emps, EmployeeInfoBetter.SortMethod.BYNAME);
		System.out.println(emps);
		// same instance
		ei.sort(emps, EmployeeInfoBetter.SortMethod.BYSALARY);
		System.out.println(emps);
	}
}
