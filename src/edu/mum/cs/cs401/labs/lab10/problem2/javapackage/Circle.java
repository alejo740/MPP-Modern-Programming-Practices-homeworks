package edu.mum.cs.cs401.labs.lab10.problem2.javapackage;

import edu.mum.cs.cs401.labs.lab10.problem2.bugreporter.BugReport;

@BugReport(assignedTo = "Tom Jones", reportedBy = "Corazza", description = "computePerimeter incorrect")
public class Circle implements ClosedCurve {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double computePerimeter() {
		return Math.PI * radius * radius;
	}
}
