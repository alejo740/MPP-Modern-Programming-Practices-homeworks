package edu.mum.cs.cs401.labs.lab03.problem3.composition;

public class Cylinder {
	private Circle circle;
	private double height;

	public Cylinder() {
		circle = new Circle();
		height = 1.0;
	}

	public Cylinder(double height) {
		circle = new Circle();
		this.height = height;
	}

	public Cylinder(double radius, double height) {
		circle = new Circle(radius);
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public double getVolume() {
		return circle.getArea() * height;
	}
}
