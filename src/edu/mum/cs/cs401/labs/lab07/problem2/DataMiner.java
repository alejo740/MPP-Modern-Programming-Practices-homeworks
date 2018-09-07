package edu.mum.cs.cs401.labs.lab07.problem2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataMiner {
	List<ClosedCurve> objects = new ArrayList<>();

	// OO (good) way of performing computation
	public double computeAveragePerimeter() {
		if (objects == null || objects.isEmpty())
			return 0.0;
		double sum = objects.stream().mapToDouble(ClosedCurve::computePerimeter).sum();
		return sum / objects.size();
	}

	public static void main(String[] args) {
		DataMiner dm = new DataMiner();
		dm.objects.add(new Rectangle(5, 7));
		dm.objects.add(new Rectangle(2, 9));
		dm.objects.add(new Circle(6));
		dm.objects.add(new EquilateralTriangle(12));
		dm.objects.add(new Ellipse(15, 25));
		dm.objects.add(new Ellipse(32, 44));
		dm.objects.add(new Circle(3));
		dm.objects.add(new EquilateralTriangle(66));
		System.out.println(dm.computeAveragePerimeter());
	}
}
