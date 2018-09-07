package edu.mum.cs.cs401.labs.lab07.problem2;

import java.util.Arrays;

public interface Polygon extends ClosedCurve {

	public double[] getSides();

	@Override
	default double computePerimeter() {
		double[] sides = getSides();
		return Arrays.stream(sides).sum();
	}

}
