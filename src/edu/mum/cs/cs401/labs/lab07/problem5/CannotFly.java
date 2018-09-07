package edu.mum.cs.cs401.labs.lab07.problem5;

public interface CannotFly extends FlyWithWings {

	@Override
	default void fly() {
		System.out.println("cannot fly");
	}


}
