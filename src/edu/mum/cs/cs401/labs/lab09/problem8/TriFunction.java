package edu.mum.cs.cs401.labs.lab09.problem8;

@FunctionalInterface
public interface TriFunction<S, T, U, R> {

	R apply(S s, T t, U u);
	
}
