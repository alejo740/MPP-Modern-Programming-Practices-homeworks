package edu.mum.cs.cs401.labs.lab05.problem2;

public class MallardDuck extends Duck {

	public MallardDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("displaying Mallar duck");
	}

}
