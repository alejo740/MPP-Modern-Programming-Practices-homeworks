package edu.mum.cs.cs401.labs.lab09.problem7.partB;

@FunctionalInterface
public interface QuadFunction<A, B, C, D, R> {

	public R apply(A a, B b, C c, D d);
	
}
