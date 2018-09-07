package edu.mum.cs.cs401.labs.lab07.problem2;

public final class Rectangle implements Polygon {
	final private double width;
	final private double length;

	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}

	@Override
	public double[] getSides() {
		return new double[] { width, width, length, length };
	}
}
