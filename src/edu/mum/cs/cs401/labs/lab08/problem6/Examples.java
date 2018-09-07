package edu.mum.cs.cs401.labs.lab08.problem6;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Examples {

	// A: Class::instanceMethod
	Function<Employee, String> employeeName1 = e -> e.getName();
	Function<Employee, String> employeeName2 = Employee::getName;

	// B: Class::instanceMethod
	BiConsumer<Employee, String> setName1 = (e, n) -> e.setName(n);
	BiConsumer<Employee, String> setName2 = Employee::setName;

	// C: Class::instanceMethod
	Comparator<String> comparatorString1 = (x, y) -> x.compareTo(y);
	Comparator<String> comparatorString2 = String::compareTo;

	// D: Class::staticMethod
	BiFunction<Double, Double, Double> exponentialFunction1 = (x, y) -> Math.pow(x, y);
	BiFunction<Double, Double, Double> exponentialFunction2 = Math::pow;

	// E: Class::instanceMethod
	Function<Apple, Double> appleWeight1 = x -> x.getWeight();
	Function<Apple, Double> appleWeight2 = Apple::getWeight;
	
	// F: Class::staticMethod
	Function<String, Integer> parseInt1 = x -> Integer.parseInt(x);
	Function<String, Integer> parseInt2 = Integer::parseInt;
	
	//G: object::instanceMethod
	EmployeeNameComparator comp = new EmployeeNameComparator();
	Comparator<Employee> comparatorEmployee1 = (x, y) -> comp.compare(x, y);
	Comparator<Employee> comparatorEmployee2 = comp::compare;
	
	private void evaluator() {
		Employee employee1 = new Employee("Edwin", 150000);
		Apple apple1 = new Apple(38.9);
		
		System.out.println("employeeName:");
		System.out.println(employeeName2.apply(employee1));
		System.out.println("----");
		
		System.out.println("setName to: Alejandro");
		setName2.accept(employee1, "Alejandro");
		System.out.println(employeeName2.apply(employee1));
		System.out.println("----");
		
		System.out.println("ComparatorStrings: Hello and world"); 
		System.out.println(comparatorString2.compare("Hello", "world"));
		System.out.println("----");
		
		System.out.println("ExponentialFunction2: 2 ^ 10"); 
		System.out.println(exponentialFunction2.apply(2.0, 10.0));
		System.out.println("----");
		
		System.out.println("AppleWeight: "); 
		System.out.println(appleWeight2.apply(apple1));
		System.out.println("----");
		
		System.out.println("ParseInt: 125"); 
		System.out.println(parseInt2.apply("125"));
		System.out.println("----");
		
		System.out.println("ComparatorEmployee:"); 
		System.out.println(comparatorEmployee1.compare(employee1, new Employee("Edwin", 150000)));
		System.out.println("----");
		
		
	}

	public static void main(String[] args) {
		Examples examples = new Examples();
		examples.evaluator();
	}

	class Apple {
		private double weight;

		Apple(double weight) {
			this.weight = weight;
		}

		public double getWeight() {
			return weight;
		}
	}

}
