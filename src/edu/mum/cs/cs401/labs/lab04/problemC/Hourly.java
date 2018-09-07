package edu.mum.cs.cs401.labs.lab04.problemC;

public class Hourly extends Employee {
	private double hourlyWage;
	private double hoursPerWeek;

	public Hourly(double hourlyWage, double hoursPerWeek) {
		this.hourlyWage = hourlyWage;
		this.hoursPerWeek = hoursPerWeek;
	}

	public double calcGrossPay() {
		return hourlyWage * hoursPerWeek * 4;
	}
}
