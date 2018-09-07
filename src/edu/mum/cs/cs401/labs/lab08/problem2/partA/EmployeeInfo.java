package edu.mum.cs.cs401.labs.lab08.problem2.partA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeInfo {
	static enum SortMethod {
		BYNAME, BYSALARY
	};

	SortMethod method;

	public EmployeeInfo(SortMethod method) {
		this.method = method;
	}

	public void sort(List<Employee> emps) {
		if (method == SortMethod.BYNAME) {
			Collections.sort(emps, new EmployeeNameComparator());
		} else if (method == SortMethod.BYSALARY) {
			Collections.sort(emps, new EmployeeSalaryComparator());
		}
	}

	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Joe", 100000));
		emps.add(new Employee("Joe", 50000));
		emps.add(new Employee("Andy", 60000));
		emps.add(new Employee("Edwin", 90000));
		emps.add(new Employee("Edwin", 90000));

		EmployeeInfo ei = new EmployeeInfo(EmployeeInfo.SortMethod.BYNAME);
		ei.sort(emps);
		System.out.println(emps);

		ei = new EmployeeInfo(EmployeeInfo.SortMethod.BYSALARY);
		ei.sort(emps);
		System.out.println(emps);

		Employee edwin = new Employee("Edwin", 100000);
		Employee edwin2 = new Employee("Edwin", 200000);

		//ANSWER Point 2A 
		System.out.println("edwin equals edwin2? " + edwin.equals(edwin2));
		EmployeeNameComparator c = new EmployeeNameComparator();
		System.out.println("edwin equals edwin2? " + (c.compare(edwin, edwin2) == 0));
	}
}
