package edu.mum.cs.cs401.labs.lab04.problemC;

public class Salaried extends Employee {
	private double Salary;

	public Salaried(double Salary) {
		this.Salary = Salary;
	}

	public double calcGrossPay() {
		return Salary;
	}
}
