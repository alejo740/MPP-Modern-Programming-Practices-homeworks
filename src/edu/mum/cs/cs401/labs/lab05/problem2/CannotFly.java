package edu.mum.cs.cs401.labs.lab05.problem2;

public class CannotFly implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("cannot fly");
	}

}
