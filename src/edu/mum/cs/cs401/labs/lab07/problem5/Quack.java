package edu.mum.cs.cs401.labs.lab07.problem5;

public interface Quack {

	default void quack() {
		System.out.println("quacking");
	}

}
