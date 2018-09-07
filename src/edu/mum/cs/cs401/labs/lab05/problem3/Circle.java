package edu.mum.cs.cs401.labs.lab05.problem3;

public final class Circle implements Shape {
	final private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double computeArea() {
		return Math.PI * radius * radius;
	}

	public double getradius() {
		return radius;
	}
}
