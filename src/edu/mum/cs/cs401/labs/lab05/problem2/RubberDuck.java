package edu.mum.cs.cs401.labs.lab05.problem2;

public class RubberDuck extends Duck {

	public RubberDuck() {
		flyBehavior = new CannotFly();
		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("displaying Rubber duck");
	}

}
