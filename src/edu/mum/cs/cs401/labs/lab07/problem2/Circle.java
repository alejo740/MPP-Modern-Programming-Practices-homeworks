package edu.mum.cs.cs401.labs.lab07.problem2;

public final class Circle implements ClosedCurve {
	final private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	@Override
	public double computePerimeter() {
		return 2 * Math.PI * radius;
	}
}
