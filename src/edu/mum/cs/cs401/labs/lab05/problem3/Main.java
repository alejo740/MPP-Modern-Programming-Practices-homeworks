package edu.mum.cs.cs401.labs.lab05.problem3;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Shape circle1 = new Circle(300);
		Shape triangle1 = new Triangle(100, 85);
		Shape rectangle1 = new Rectangle(150, 200);
		
		List<Shape> list = new ArrayList<Shape>();
		list.add(circle1);
		list.add(triangle1);
		list.add(rectangle1);
		
		double sum = 0.0;
		for (Shape shape : list) {
			sum += shape.computeArea();
		}

		System.out.println("Sum of Areas: " + sum);
	}

}
