package edu.mum.cs.cs401.labs.lab07.problem5;

public class RubberDuck extends Duck implements CannotFly, Quack {

	@Override
	public void display() {
		System.out.println("displaying Rubber duck");
	}

}
