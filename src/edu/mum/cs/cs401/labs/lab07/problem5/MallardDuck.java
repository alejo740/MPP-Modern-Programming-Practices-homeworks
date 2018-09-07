package edu.mum.cs.cs401.labs.lab07.problem5;

public class MallardDuck extends Duck implements FlyWithWings, Quack {

	public MallardDuck() {
		//flyBehavior = new FlyWithWings();
		//quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("displaying Mallar duck");
	}

}
