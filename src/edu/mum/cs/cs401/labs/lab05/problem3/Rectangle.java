package edu.mum.cs.cs401.labs.lab05.problem3;

public final class Rectangle implements Shape {
	final private double width;
	final private double height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double computeArea() {
		return width * height;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}
}
