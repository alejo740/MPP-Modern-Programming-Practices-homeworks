package edu.mum.cs.cs401.labs.lab08.problem1.partG;

import java.util.function.Predicate;

public class MyClass {

	private String varA = "variableA";
	private Predicate<MyClass> predicate = p -> p.equals(this); // this::equals; 

	public MyClass(String varA) {
		this.varA = varA;
	}

	public boolean myMethod(MyClass cl) {
		return predicate.test(cl);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof MyClass))
			return false;
		MyClass e = (MyClass) obj;
		return e.varA.equals(this.varA);
	}

	public static void main(String[] args) {
		MyClass myClassA = new MyClass("instanceVarB");
		MyClass myClassB = new MyClass("instanceVarB");
		boolean result = myClassA.myMethod(myClassB);
		System.out.println(result);
	}

}
