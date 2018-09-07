package edu.mum.cs.cs401.labs.lab04.problemC;

import java.time.YearMonth;

public abstract class Employee {
	public int empId;

	public void print() {
		System.out.println("Employee id: " + empId);
	}

	public Paycheck calcCompensation(YearMonth month) {
		double totalSalary = this.calcGrossPay();
		double fica = 0.23 * totalSalary;
		double state = 0.05 * totalSalary;
		double local = 0.01 * totalSalary;
		double medicare = 0.03 * totalSalary;
		double socialSecurity = 0.075 * totalSalary;

		return new Paycheck(totalSalary, fica, state, local, medicare, socialSecurity);
	}

	public abstract double calcGrossPay();
}
