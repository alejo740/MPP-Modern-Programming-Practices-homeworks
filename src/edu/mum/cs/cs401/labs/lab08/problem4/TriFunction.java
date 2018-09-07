package edu.mum.cs.cs401.labs.lab08.problem4;

@FunctionalInterface
public interface TriFunction<S, T, U, R> {

	R apply(S s, T t, U u);
	
}
